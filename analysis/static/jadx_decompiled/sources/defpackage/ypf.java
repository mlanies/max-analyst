package defpackage;

/* loaded from: classes2.dex */
public final class ypf extends pk0 {
    public static final /* synthetic */ int b = 0;
    public final String a;

    public ypf(String str) {
        this.a = str;
    }

    public static String b(String str) {
        String[] strArrSplit = str.split("/");
        String str2 = strArrSplit.length == 0 ? "" : strArrSplit[strArrSplit.length - 1];
        if (str2.length() <= 0) {
            return null;
        }
        int length = str2.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(str2.charAt(i))) {
                return null;
            }
        }
        String[] strArrSplit2 = str.split("/");
        return strArrSplit2.length == 0 ? "" : strArrSplit2[strArrSplit2.length - 1];
    }

    @Override // defpackage.pk0
    public final iqd a() {
        return new q1a(1, new gte(15, this));
    }
}
