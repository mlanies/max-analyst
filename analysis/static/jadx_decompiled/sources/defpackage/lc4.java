package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class lc4 implements jde {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lc4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.jde
    public final Object get() {
        switch (this.a) {
            case 0:
                try {
                    return (wj8) ((Class) this.b).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            case 1:
                return (ec4) this.b;
            case 2:
                return (wj8) this.b;
            case 3:
                return (hz7) this.b;
            case 4:
                return (gz7) this.b;
            case 5:
                return (cle) this.b;
            case 6:
                return (mgc) this.b;
            case 7:
                return (pn7) this.b;
            default:
                return Boolean.valueOf(((g85) this.b).L0);
        }
    }
}
