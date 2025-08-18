package defpackage;

import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.Objects;

/* loaded from: classes.dex */
public final class vee implements SurfaceHolder.Callback {
    public Size X;
    public boolean Y = false;
    public boolean Z = false;
    public Size a;
    public see b;
    public see c;
    public u00 o;
    public final /* synthetic */ wee s0;

    public vee(wee weeVar) {
        this.s0 = weeVar;
    }

    public final boolean a() {
        wee weeVar = this.s0;
        Surface surface = weeVar.e.getHolder().getSurface();
        if (this.Y || this.b == null || !Objects.equals(this.a, this.X)) {
            return false;
        }
        u00 u00Var = this.o;
        see seeVar = this.b;
        Objects.requireNonNull(seeVar);
        seeVar.b(surface, ot3.a(weeVar.e.getContext()), new cy1(8, u00Var));
        this.Y = true;
        weeVar.a = true;
        weeVar.m();
        return true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.X = new Size(i2, i3);
        a();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        see seeVar;
        if (!this.Z || (seeVar = this.c) == null) {
            return;
        }
        seeVar.d();
        seeVar.j.b(null);
        this.c = null;
        this.Z = false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (this.Y) {
            see seeVar = this.b;
            if (seeVar != null) {
                Objects.toString(seeVar);
                this.b.l.a();
            }
        } else {
            see seeVar2 = this.b;
            if (seeVar2 != null) {
                Objects.toString(seeVar2);
                this.b.d();
            }
        }
        this.Z = true;
        see seeVar3 = this.b;
        if (seeVar3 != null) {
            this.c = seeVar3;
        }
        this.Y = false;
        this.b = null;
        this.o = null;
        this.X = null;
        this.a = null;
    }
}
