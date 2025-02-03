package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        data.publicField = 1;
        data.publicMethod();

        // 같은 패키지 default 호출 불가
//        data.defaultField = 2;
//        data.defaultMethod();
        // private 호출 불가
//        data.publicField =3;
//        data.privateMethod();

        data.innerAccess();
    }
}
