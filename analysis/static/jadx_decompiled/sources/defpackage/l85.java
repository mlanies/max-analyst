package defpackage;

/* loaded from: classes.dex */
public final class l85 {
    public final rze a;
    public final int[] b;

    public l85(rze rzeVar, int[] iArr) {
        if (iArr.length == 0) {
            z04.v("Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = rzeVar;
        this.b = iArr;
    }
}
