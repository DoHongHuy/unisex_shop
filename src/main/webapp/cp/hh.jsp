style=" background-color: #3c1b1b;"









private static final String USERNAME_PATTERN = "^(?=.{8,20}$)(?![_.])(?!.*[_.]{2})[a-zA-Z0-9._]+(?<![_.])$";
private static final String PASSWORD_PATTERN = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^*])(?!.*['\"`]).{6,}";

private static final String FUllNAME_PATTERN = "^([A-Z]+[a-z]*[ ]?)+$";
private static final String PHONE_REGEX = "^[0][1-9][0-9]{8,9}$";
private static final String EMAIL_PATTERN = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,3}$";

private static final String Role ="(ADMIN)|(USER)";

public static boolean isUsernameValid(String userName){
return Pattern.compile(USERNAME_PATTERN).matcher(userName).matches();
}

public static boolean isPasswordValid(String password){
return Pattern.compile(PASSWORD_PATTERN).matcher(password).matches();
}

public static boolean isFullNameValid(String name){
return Pattern.compile(FUllNAME_PATTERN).matcher(name).matches();
}

public static boolean isPhoneValid(String phone){
return Pattern.compile(PHONE_REGEX).matcher(phone).matches();
}

public static boolean isEmailValid(String email){
return Pattern.compile(EMAIL_PATTERN).matcher(email).matches();
}
public static boolean isRoleValid(String role){
return Pattern.compile(Role).matcher(role).matches();
}
4:45
List<String> errors = new ArrayList<>();
boolean isUsername = Validate.isUsernameValid(usename);
boolean isPassword = Validate.isPasswordValid(password);
boolean isFullName = Validate.isFullNameValid(fullname);
boolean isPhone = Validate.isPhoneValid(phone);
boolean isEmail = Validate.isEmailValid(email);
boolean isRole = Validate.isRoleValid(role);

if (usename.equals("")) {
errors.add("Tên Username không được để trống")
;
}
if
(
password.equals("")) {
errors.add("Password không được để trống")
;
}
if
(
fullname.equals("")){
errors.add("Password không được để trống")
;
}
if
(
phone.equals("")){
errors.add("Phone không được để trống")
;
}
if
(
email.equals("")){
errors.add("Email không được để trống")
;
}
if
(
img.equals("")){
errors.add("Image không được để trống")
;
}
if
(
!isUsername){
errors.add("Nhập Username sai định dạng(Không bao gồm dấu cách, kí tự đặc biệt)")
;
}
if
(!isPassword){
errors.add("Password sai định dạng(VD: Ab1@ tối thiếu 4 kí tự trở lên)")
;
}
if
(
!isFullName
){

errors.add
(
"Nhập Fullname sai định dạng(Tên phải viết hoa chữ cái đầu và không dấu)"
)
;
}
if(!isPhone){
errors.add("Nhập Phone sai định dạng(không bao gồm dấu cách,chữ,kí tự đặc biệt, Số điện thoại bao gồm 10 số và bắt đầu là số 0)")
;
}
if
(
!isEmail
){
errors.add("Nhập Email sai định dạng (vd: buiquangvinh@gmail.com)")
;
}
if
(!isRole){
errors.add("Nhập Role sai định dạng (vd: ADMIN | USER)")
;
}

boolean success = false;
if
(errors.size() == 0){
User user = new User(Integer.parseInt(id),usename, password, fullname, phone, email, cityId, role ,img);
success = userService.update(user);
}

if (success){
request.setAttribute("success",true);
}else {
errors.add("Cập nhật thật bại")
;
}
if
(
errors.size
() > 0) {
request.setAttribute("errors", errors);
}


dispatcher.forward(request, response);