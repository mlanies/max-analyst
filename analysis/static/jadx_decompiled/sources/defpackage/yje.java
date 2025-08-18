package defpackage;

/* loaded from: classes2.dex */
public final class yje extends RuntimeException {
    public final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yje(String str, String str2) {
        super(str);
        this.a = str2;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.a;
    }
}
