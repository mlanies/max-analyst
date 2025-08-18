package defpackage;

/* loaded from: classes.dex */
public final class e63 extends rd7 implements m56 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e63(int i) {
        super(1);
        this.a = i;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        ((Number) obj).intValue();
        throw new IndexOutOfBoundsException(au1.h(new StringBuilder("Collection doesn't contain element at index "), this.a, '.'));
    }
}
