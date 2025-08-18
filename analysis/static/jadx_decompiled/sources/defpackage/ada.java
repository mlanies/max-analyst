package defpackage;

import android.content.Context;
import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class ada extends cj0 {
    public static final /* synthetic */ int o = 0;
    public final o45 h;
    public final uuc i;
    public final kke j;
    public final khe k;
    public final khe l;
    public final khe m;
    public final AtomicBoolean n;

    public ada(Context context, o45 o45Var, kk5 kk5Var, y7d y7dVar, f6a f6aVar, uuc uucVar, kke kkeVar) {
        super(context, kk5Var.b, kk5Var, y7dVar, f6aVar, o45Var);
        this.h = o45Var;
        this.i = uucVar;
        this.j = kkeVar;
        final int i = 0;
        this.k = new khe(new k56(this) { // from class: yca
            public final /* synthetic */ ada b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return j1e.a(((w9a) this.b.j).b());
                    default:
                        ada adaVar = this.b;
                        return new trc(adaVar.i, ((w9a) adaVar.j).b());
                }
            }
        });
        this.l = new khe(new zj7(18, y7dVar));
        final int i2 = 1;
        this.m = new khe(new k56(this) { // from class: yca
            public final /* synthetic */ ada b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return j1e.a(((w9a) this.b.j).b());
                    default:
                        ada adaVar = this.b;
                        return new trc(adaVar.i, ((w9a) adaVar.j).b());
                }
            }
        });
        this.n = new AtomicBoolean();
    }

    public final boolean e(String str, String str2, float f, float f2, nqb nqbVar, boolean z, n2f n2fVar) {
        AtomicBoolean atomicBoolean = this.n;
        boolean zA = true;
        atomicBoolean.set(true);
        CopyOnWriteArraySet copyOnWriteArraySet = this.g;
        boolean zIsEmpty = copyOnWriteArraySet.isEmpty();
        Handler handler = this.f;
        if (!zIsEmpty) {
            final int i = 1;
            handler.post(new Runnable() { // from class: bj0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            Iterator it = this.g.iterator();
                            while (it.hasNext()) {
                                gdf gdfVar = (gdf) it.next();
                                String str3 = gdfVar.e;
                                ir6 ir6Var = hm9.m;
                                if (ir6Var != null && ir6Var.c()) {
                                    ir6Var.d(us7.X, str3, "Player autoplay. onMediaProcessingFinished.", null);
                                }
                                gdfVar.r = false;
                                RecyclerView recyclerView = gdfVar.f;
                                if (recyclerView != null) {
                                    gdfVar.e(recyclerView, false);
                                }
                            }
                            break;
                        default:
                            Iterator it2 = this.g.iterator();
                            while (it2.hasNext()) {
                                ((gdf) it2.next()).c();
                            }
                            break;
                    }
                }
            });
        }
        try {
            if (!((Boolean) ((gl8) this.l.getValue()).d.getValue()).booleanValue() || !g(str, str2, f, f2, nqbVar, z, n2fVar)) {
                zA = xef.a(this.a, this.h, str, str2, f, f2, nqbVar, z, new rxd(24, n2fVar));
            }
            return zA;
        } finally {
            atomicBoolean.set(false);
            if (!copyOnWriteArraySet.isEmpty()) {
                final int i2 = 0;
                handler.post(new Runnable() { // from class: bj0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                Iterator it = this.g.iterator();
                                while (it.hasNext()) {
                                    gdf gdfVar = (gdf) it.next();
                                    String str3 = gdfVar.e;
                                    ir6 ir6Var = hm9.m;
                                    if (ir6Var != null && ir6Var.c()) {
                                        ir6Var.d(us7.X, str3, "Player autoplay. onMediaProcessingFinished.", null);
                                    }
                                    gdfVar.r = false;
                                    RecyclerView recyclerView = gdfVar.f;
                                    if (recyclerView != null) {
                                        gdfVar.e(recyclerView, false);
                                    }
                                }
                                break;
                            default:
                                Iterator it2 = this.g.iterator();
                                while (it2.hasNext()) {
                                    ((gdf) it2.next()).c();
                                }
                                break;
                        }
                    }
                });
            }
        }
    }

    public final void f(String str, boolean z) {
        if (z) {
            s36.o().g(wv6.b(str));
        } else {
            s36.o().f(wv6.b(str), null);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02c4 A[Catch: all -> 0x02c8, MediaTransformException -> 0x02ca, TRY_LEAVE, TryCatch #12 {MediaTransformException -> 0x02ca, all -> 0x02c8, blocks: (B:133:0x02ad, B:135:0x02c4), top: B:206:0x02ad }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0304 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03e1 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(java.lang.String r42, java.lang.String r43, float r44, float r45, defpackage.nqb r46, boolean r47, defpackage.n2f r48) {
        /*
            Method dump skipped, instructions count: 1109
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ada.g(java.lang.String, java.lang.String, float, float, nqb, boolean, n2f):boolean");
    }
}
