package defpackage;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final /* synthetic */ class ii5 implements Runnable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ ii5(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
        this.b = z;
        this.X = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((ki5) this.c).a((ri9) this.o, this.b, (li9) this.X);
                break;
            case 1:
                ((lq1) this.c).b(this.o);
                if (this.b) {
                    ((bm7) this.X).cancel(true);
                    break;
                }
                break;
            case 2:
                ((ue) this.c).j((qh8) this.o, (sh0) this.X, this.b);
                break;
            default:
                si8 si8Var = (si8) ((td) this.c).o;
                x4b x4bVar = si8Var.f.s;
                j47.m0(x4bVar, (ph8) this.o);
                int playbackState = x4bVar.getPlaybackState();
                if (playbackState == 1) {
                    if (x4bVar.t1(2)) {
                        x4bVar.prepare();
                    }
                } else if (playbackState == 4 && x4bVar.t1(4)) {
                    x4bVar.E();
                }
                boolean z = this.b;
                if (z && x4bVar.t1(1)) {
                    x4bVar.play();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i : new int[]{31, 2}) {
                    fm9.k(!false);
                    sparseBooleanArray.append(i, true);
                }
                if (z) {
                    fm9.k(!false);
                    sparseBooleanArray.append(1, true);
                }
                fm9.k(!false);
                si8Var.f.p((oh8) this.X);
                break;
        }
    }

    public /* synthetic */ ii5(ue ueVar, qh8 qh8Var, sh0 sh0Var, boolean z) {
        this.a = 2;
        this.c = ueVar;
        this.o = qh8Var;
        this.X = sh0Var;
        this.b = z;
    }

    public /* synthetic */ ii5(lq1 lq1Var, oq1 oq1Var) {
        this.a = 1;
        this.c = lq1Var;
        this.o = null;
        this.b = true;
        this.X = oq1Var;
    }
}
