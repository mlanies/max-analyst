package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class fdf implements tlf {
    public final gef X;
    public final WeakReference Y;
    public final mw7 Z;
    public final String a;
    public final long b;
    public final dkf c;
    public final f4b o;

    public fdf(String str, long j, dkf dkfVar, f4b f4bVar, gef gefVar, WeakReference weakReference, id2 id2Var) {
        this.a = str;
        this.b = j;
        this.c = dkfVar;
        this.o = f4bVar;
        this.X = gefVar;
        this.Y = weakReference;
        this.Z = id2Var;
    }

    @Override // defpackage.tlf
    public final void G(Surface surface) {
        String name = fdf.class.getName();
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            us7 us7Var = us7.X;
            long j = this.b;
            String str = this.a;
            boolean zB = this.c.b();
            StringBuilder sbJ = z7b.j("Player autoplay. Surface created, \n                            |msgId:", j, ", \n                            |attachId:", str);
            sbJ.append("\n                            |playing:");
            sbJ.append(zB);
            ir6Var.d(us7Var, name, x9e.c0(sbJ.toString()), null);
        }
        this.c.M0(surface);
    }

    @Override // defpackage.tlf
    public final int M0() {
        return this.X.getHeight();
    }

    @Override // defpackage.tlf
    public final int R() {
        return this.X.getWidth();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdf)) {
            return false;
        }
        fdf fdfVar = (fdf) obj;
        return tpa.f(this.a, fdfVar.a) && this.b == fdfVar.b && tpa.f(this.c, fdfVar.c) && tpa.f(this.o, fdfVar.o) && tpa.f(this.X, fdfVar.X) && tpa.f(this.Y, fdfVar.Y) && tpa.f(this.Z, fdfVar.Z);
    }

    public final int hashCode() {
        return this.Z.hashCode() + ((this.Y.hashCode() + ((this.X.hashCode() + ((this.o.hashCode() + ((this.c.hashCode() + h4f.m(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // defpackage.tlf
    public final int j() {
        this.X.getClass();
        return 2;
    }

    @Override // defpackage.tlf
    public final void onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        String name = fdf.class.getName();
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            us7 us7Var = us7.X;
            long j = this.b;
            String str = this.a;
            boolean zB = this.c.b();
            int iG = this.Z.g();
            StringBuilder sbJ = z7b.j("Player autoplay. Surface destroyed, \n                            |msgId:", j, ", \n                            |attachId:", str);
            sbJ.append("\n                            |playing:");
            sbJ.append(zB);
            sbJ.append("\n                            |states:");
            sbJ.append(iG);
            ir6Var.d(us7Var, name, x9e.c0(sbJ.toString()), null);
        }
        this.o.a(this.c);
        cmf cmfVar = (cmf) this.Y.get();
        if (cmfVar != null) {
            cmfVar.u();
        }
        this.Z.e(this.a);
    }

    public final String toString() {
        return "PlayingState(attachId=" + this.a + ", messageId=" + this.b + ", player=" + this.c + ", playerHolder=" + this.o + ", videoContent=" + this.X + ", weakViewRef=" + this.Y + ", states=" + this.Z + ")";
    }
}
