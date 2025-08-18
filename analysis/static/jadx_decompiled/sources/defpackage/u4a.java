package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class u4a extends gob {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u4a(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.a = i2;
    }

    @Override // defpackage.gob, defpackage.zb7
    public final Object get() {
        switch (this.a) {
            case 0:
                return ((x4a) this.receiver).a;
            default:
                return Boolean.valueOf(((u6c) this.receiver).c.j() > 8);
        }
    }
}
