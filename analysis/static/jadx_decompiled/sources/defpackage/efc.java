package defpackage;

/* loaded from: classes.dex */
public final class efc extends jw6 {
    public static final efc u0 = new efc();
    public final transient Object X;
    public final transient Object[] Y;
    public final transient int Z;
    public final transient int s0;
    public final transient efc t0;

    public efc() {
        this.X = null;
        this.Y = new Object[0];
        this.Z = 0;
        this.s0 = 0;
        this.t0 = this;
    }

    @Override // defpackage.cx6
    public final jx6 c() {
        return new hfc(this, this.Y, this.Z, this.s0);
    }

    @Override // defpackage.cx6
    public final jx6 d() {
        return new ifc(this, new jfc(this.Z, this.s0, this.Y));
    }

    @Override // defpackage.cx6
    public final boolean g() {
        return false;
    }

    @Override // defpackage.cx6, java.util.Map
    public final Object get(Object obj) {
        Object objK = kfc.k(this.X, this.Y, this.s0, this.Z, obj);
        if (objK == null) {
            return null;
        }
        return objK;
    }

    @Override // java.util.Map
    public final int size() {
        return this.s0;
    }

    public efc(int i, Object[] objArr) {
        this.Y = objArr;
        this.s0 = i;
        this.Z = 0;
        int iH = i >= 2 ? jx6.h(i) : 0;
        Object objJ = kfc.j(objArr, i, iH, 0);
        if (!(objJ instanceof Object[])) {
            this.X = objJ;
            Object objJ2 = kfc.j(objArr, i, iH, 1);
            if (!(objJ2 instanceof Object[])) {
                this.t0 = new efc(objJ2, objArr, i, this);
                return;
            }
            throw ((bx6) ((Object[]) objJ2)[2]).a();
        }
        throw ((bx6) ((Object[]) objJ)[2]).a();
    }

    public efc(Object obj, Object[] objArr, int i, efc efcVar) {
        this.X = obj;
        this.Y = objArr;
        this.Z = 1;
        this.s0 = i;
        this.t0 = efcVar;
    }
}
