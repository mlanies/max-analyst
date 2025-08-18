package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* loaded from: classes2.dex */
public final class ijf implements tlf {
    public int X = 1;
    public float Y = 0.0f;
    public final dkf Z;
    public final long a;
    public final String b;
    public final o00 c;
    public final gef o;
    public final f4b s0;

    public ijf(long j, String str, o00 o00Var, gef gefVar, dkf dkfVar, f4b f4bVar) {
        this.a = j;
        this.b = str;
        this.c = o00Var;
        this.o = gefVar;
        this.Z = dkfVar;
        this.s0 = f4bVar;
    }

    @Override // defpackage.tlf
    public final void G(Surface surface) {
        this.Z.M0(surface);
    }

    @Override // defpackage.tlf
    public final int M0() {
        return this.o.getHeight();
    }

    @Override // defpackage.tlf
    public final int R() {
        return this.o.getWidth();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijf)) {
            return false;
        }
        ijf ijfVar = (ijf) obj;
        return this.a == ijfVar.a && tpa.f(this.b, ijfVar.b) && tpa.f(this.c, ijfVar.c) && tpa.f(this.o, ijfVar.o) && this.X == ijfVar.X && Float.compare(this.Y, ijfVar.Y) == 0 && tpa.f(this.Z, ijfVar.Z) && tpa.f(this.s0, ijfVar.s0);
    }

    public final int hashCode() {
        return this.s0.hashCode() + ((this.Z.hashCode() + ms2.c(ey8.g(this.X, (this.o.hashCode() + ((this.c.hashCode() + rh4.d(Long.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31, 31), this.Y, 31)) * 31);
    }

    @Override // defpackage.tlf
    public final int j() {
        return 3;
    }

    @Override // defpackage.tlf
    public final void onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.s0.a(this.Z);
    }

    public final String toString() {
        int i = this.X;
        float f = this.Y;
        StringBuilder sb = new StringBuilder("VideoMessageState(messageId=");
        sb.append(this.a);
        sb.append(", attachId=");
        sb.append(this.b);
        sb.append(", attachModel=");
        sb.append(this.c);
        sb.append(", videoContent=");
        sb.append(this.o);
        sb.append(", state=");
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "STOP" : "PAUSE" : "IN_PROGRESS" : "PLAY" : "PREPARE");
        sb.append(", progress=");
        sb.append(f);
        sb.append(", player=");
        sb.append(this.Z);
        sb.append(", playerHolder=");
        sb.append(this.s0);
        sb.append(")");
        return sb.toString();
    }
}
