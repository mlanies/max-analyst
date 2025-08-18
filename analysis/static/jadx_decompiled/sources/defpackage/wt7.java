package defpackage;

/* loaded from: classes2.dex */
public final class wt7 extends Error {
    public final String a;

    public wt7(String str, byte b) {
        super(str, null);
        this.a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wt7(String str, int i) {
        this(zr6.i("InvalidPhoneNumber (", str, ")"), (byte) 0);
        switch (i) {
            case 1:
                this(zr6.i("SmsAttemptExceed (Phone: ", str, ")"), (byte) 0);
                break;
            default:
                break;
        }
    }

    public wt7(String str, Throwable th) {
        this(rh4.j(str == null ? "Unspecified" : str, " | ", th != null ? th.getMessage() : null), (byte) 0);
    }
}
