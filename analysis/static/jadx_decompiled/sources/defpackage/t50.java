package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;

/* loaded from: classes.dex */
public final class t50 implements p40 {
    public boolean X;
    public boolean Y;
    public final r50 Z;
    public final ch9 a;
    public final jpb b;
    public final khe c;
    public final q40 o;

    public t50(Context context, ch9 ch9Var, jpb jpbVar) {
        this.a = ch9Var;
        this.b = jpbVar;
        khe kheVarD = u50.a.getAccessor().d(kr1.class);
        this.c = new khe(new a5(context, 4));
        this.o = new q40(context, this);
        o9g o9gVar = new o9g(3, this);
        this.Z = new r50(this);
        khe kheVar = new khe(new x5(16, this));
        ((uh9) ch9Var).e(o9gVar);
        ((wr1) ((kr1) kheVarD.getValue())).d((s50) kheVar.getValue());
    }

    public static final boolean a(t50 t50Var) {
        for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) t50Var.c.getValue()).getDevices(2)) {
            int type = audioDeviceInfo.getType();
            if (type == 3 || type == 4 || type == 8) {
                return true;
            }
        }
        return false;
    }

    public static final void c(t50 t50Var) {
        boolean z = ((uh9) t50Var.a).x;
        q40 q40Var = t50Var.o;
        if (z) {
            q40Var.m(1);
            t50Var.d();
            return;
        }
        q40Var.k();
        if (t50Var.X) {
            t50Var.X = false;
            jpb jpbVar = t50Var.b;
            jpbVar.b();
            jpbVar.h.remove(t50Var.Z);
        }
    }

    @Override // defpackage.p40
    public final boolean b() {
        return ((uh9) this.a).x;
    }

    public final void d() {
        if (this.Y && !this.X && ((uh9) this.a).x) {
            this.X = true;
            jpb jpbVar = this.b;
            jpbVar.a();
            jpbVar.h.add(this.Z);
        }
    }

    @Override // defpackage.p40
    public final float e() {
        return ((uh9) this.a).z;
    }

    @Override // defpackage.p40
    public final void g(float f) {
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.o.j(i);
    }

    @Override // defpackage.p40
    public final void pause() {
        ch9 ch9Var = this.a;
        if (ch9Var.b()) {
            return;
        }
        ((uh9) ch9Var).q();
    }

    @Override // defpackage.p40
    public final void play() {
        ch9 ch9Var = this.a;
        if (ch9Var.b()) {
            return;
        }
        this.o.m(1);
        ((uh9) ch9Var).r();
    }
}
