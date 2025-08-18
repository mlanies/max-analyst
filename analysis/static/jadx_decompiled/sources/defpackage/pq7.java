package defpackage;

import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class pq7 implements Serializable {
    public final boolean X;
    public final boolean Y;
    public final boolean Z;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean o;
    public final boolean s0;
    public final mqb t0;
    public final boolean u0;
    public final int v0;
    public final boolean w0;
    public final boolean x0;
    public final boolean y0;
    public final boolean z0;

    public pq7(oq7 oq7Var) {
        this.a = oq7Var.a;
        this.b = oq7Var.b;
        this.c = oq7Var.c;
        this.o = oq7Var.d;
        this.X = oq7Var.e;
        this.Y = oq7Var.f;
        this.Z = oq7Var.g;
        this.s0 = oq7Var.h;
        this.t0 = oq7Var.i;
        this.u0 = oq7Var.j;
        this.v0 = oq7Var.k;
        this.w0 = oq7Var.l;
        this.x0 = oq7Var.m;
        this.y0 = oq7Var.n;
        this.z0 = oq7Var.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pq7.class != obj.getClass()) {
            return false;
        }
        pq7 pq7Var = (pq7) obj;
        return this.a == pq7Var.a && this.b == pq7Var.b && this.c == pq7Var.c && this.o == pq7Var.o && this.X == pq7Var.X && this.Y == pq7Var.Y && this.Z == pq7Var.Z && this.s0 == pq7Var.s0 && this.u0 == pq7Var.u0 && this.v0 == pq7Var.v0 && this.w0 == pq7Var.w0 && this.x0 == pq7Var.x0 && this.y0 == pq7Var.y0 && this.z0 == pq7Var.z0 && this.t0 == pq7Var.t0;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.o), Boolean.valueOf(this.X), Boolean.valueOf(this.Y), Boolean.valueOf(this.Z), Boolean.valueOf(this.s0), this.t0, Boolean.valueOf(this.u0), Integer.valueOf(this.v0), Boolean.valueOf(this.w0), Boolean.valueOf(this.x0), Boolean.valueOf(this.y0), Boolean.valueOf(this.z0));
    }

    public final String toString() {
        return "LocalMediaToolboxViewState{qualityButtonEnable=" + this.a + ", qualityTextVisibility=" + this.b + ", qualityProgressBarVisibility=" + this.c + ", multiSelect=" + this.o + ", videoControlsVisibility=" + this.X + ", videoSeekBarVisibility=" + this.Y + ", cropVisibility=" + this.Z + ", editVisibility=" + this.s0 + ", quality=" + this.t0 + ", isNumericCheckButtonEnabled=" + this.u0 + ", numberForNumericCheckButton=" + this.v0 + ", highlightCropButton=" + this.w0 + ", highlightEditButton=" + this.x0 + ", muteVideo=" + this.y0 + '}';
    }
}
