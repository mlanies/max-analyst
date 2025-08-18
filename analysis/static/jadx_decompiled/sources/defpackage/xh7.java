package defpackage;

/* loaded from: classes.dex */
public final class xh7 extends tj0 {
    public int h;
    public int i;
    public boolean j;
    public int k;

    @Override // defpackage.tj0
    public final void a() {
        super.a();
        if (this.k < 0) {
            throw new IllegalArgumentException("Stop indicator size must be >= 0.");
        }
        if (this.h == 0) {
            if (this.b > 0 && this.g == 0) {
                throw new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            }
            if (this.c.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }
}
