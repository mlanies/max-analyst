package defpackage;

import android.content.Intent;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class ax7 {
    public final kke a;
    public final je7 b;
    public final je7 c;
    public final ContextScope d;
    public final qi9 e;
    public final LinkedHashMap f;
    public long g;
    public boolean h;
    public boolean i;

    public ax7(je7 je7Var, je7 je7Var2, kke kkeVar) {
        this.a = kkeVar;
        this.b = je7Var;
        this.c = je7Var2;
        this.d = j1e.a(((w9a) kkeVar).b());
        long[] jArr = usc.a;
        this.e = new qi9();
        this.f = new LinkedHashMap();
        this.g = -1L;
        this.h = true;
    }

    public final void a(List list) {
        cta ctaVar = cta.CHAT_INIT_TO_RENDER;
        qi9 qi9Var = this.e;
        bta btaVar = (bta) qi9Var.f(ctaVar);
        if (btaVar == null || btaVar.e != -1) {
            return;
        }
        bta btaVar2 = (bta) qi9Var.f(ctaVar);
        if (btaVar2 != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            btaVar2.e = jElapsedRealtime - btaVar2.b;
            btaVar2.h = list;
            f(jElapsedRealtime);
        }
        if (!this.i) {
            this.g = ((t33) ((q33) this.b.getValue())).F();
        }
        ((ita) this.c.getValue()).d(1, 0);
    }

    public final void b(List list) {
        cta ctaVar = cta.CHATS_INIT_TO_RENDER;
        qi9 qi9Var = this.e;
        bta btaVar = (bta) qi9Var.f(ctaVar);
        if (btaVar == null || btaVar.e != -1) {
            return;
        }
        bta btaVar2 = (bta) qi9Var.f(ctaVar);
        if (btaVar2 != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            btaVar2.e = jElapsedRealtime - btaVar2.b;
            btaVar2.h = list;
            bta btaVar3 = (bta) qi9Var.f(cta.FOLDERS_INIT_TO_RENDER);
            if (btaVar3 == null || btaVar3.e != -1) {
                f(jElapsedRealtime);
            }
        }
        ((ita) this.c.getValue()).e(1, 0);
    }

    public final eta c(zsa zsaVar) {
        kl7 kl7VarD;
        bta btaVar;
        cta ctaVar = cta.MAIN_ACTIVITY_INIT_TO_RENDER;
        qi9 qi9Var = this.e;
        bta btaVar2 = (bta) qi9Var.f(ctaVar);
        long j = 0;
        if (btaVar2 != null) {
            if (!this.h) {
                btaVar2 = null;
            }
            if (btaVar2 != null) {
                btaVar2.f = 0L;
                j = 1;
            }
        }
        cta ctaVar2 = cta.FOLDERS_INIT_TO_RENDER;
        bta btaVar3 = (bta) qi9Var.f(ctaVar2);
        zsa zsaVar2 = zsa.EVENT_OPEN_CHATS;
        long j2 = -1;
        if (btaVar3 != null) {
            if (zsaVar != zsaVar2) {
                btaVar3 = null;
            }
            if (btaVar3 != null) {
                btaVar3.f = j;
                j++;
                if (this.h) {
                    bta btaVar4 = (bta) qi9Var.f(ctaVar);
                    btaVar3.g = btaVar4 != null ? btaVar4.f : -1L;
                }
            }
        }
        cta ctaVar3 = cta.CHATS_INIT_TO_RENDER;
        bta btaVar5 = (bta) qi9Var.f(ctaVar3);
        if (btaVar5 != null) {
            if (zsaVar != zsaVar2) {
                btaVar5 = null;
            }
            if (btaVar5 != null) {
                btaVar5.f = j;
                j++;
                if (this.h) {
                    bta btaVar6 = (bta) qi9Var.f(ctaVar);
                    btaVar5.g = btaVar6 != null ? btaVar6.f : -1L;
                }
            }
        }
        cta ctaVar4 = cta.CHAT_INIT_TO_RENDER;
        bta btaVar7 = (bta) qi9Var.f(ctaVar4);
        if (btaVar7 != null) {
            if (zsaVar != zsa.EVENT_OPEN_CHAT) {
                btaVar7 = null;
            }
            if (btaVar7 != null) {
                btaVar7.f = j;
                if (this.h) {
                    bta btaVar8 = (bta) qi9Var.f(ctaVar);
                    btaVar7.g = btaVar8 != null ? btaVar8.f : -1L;
                }
            }
        }
        int iOrdinal = zsaVar.ordinal();
        if (iOrdinal == 1) {
            kl7 kl7VarL = j1e.l();
            if (!this.h) {
                return null;
            }
            bta btaVar9 = (bta) qi9Var.f(ctaVar);
            if (btaVar9 != null) {
                j2 = btaVar9.e;
                kl7VarL.add(btaVar9);
            }
            bta btaVar10 = (bta) qi9Var.f(ctaVar2);
            if (btaVar10 != null) {
                kl7VarL.add(btaVar10);
            }
            bta btaVar11 = (bta) qi9Var.f(ctaVar3);
            if (btaVar11 != null) {
                kl7VarL.add(btaVar11);
            }
            kl7VarD = j1e.d(kl7VarL);
        } else {
            if (iOrdinal != 2) {
                return null;
            }
            kl7 kl7VarL2 = j1e.l();
            if (this.h && (btaVar = (bta) qi9Var.f(ctaVar)) != null) {
                j2 = btaVar.e;
                kl7VarL2.add(btaVar);
            }
            bta btaVar12 = (bta) qi9Var.f(ctaVar4);
            if (btaVar12 == null) {
                return null;
            }
            if (!this.h) {
                j2 = btaVar12.e;
            }
            kl7VarL2.add(btaVar12);
            kl7VarD = j1e.d(kl7VarL2);
        }
        this.h = false;
        return new eta(j2, kl7VarD);
    }

    public final void d(Intent intent) {
        int iHashCode;
        String action = intent.getAction();
        this.i = action == null || ((iHashCode = action.hashCode()) == -1173447682 ? !action.equals("android.intent.action.MAIN") : !(iHashCode == -1173264947 ? action.equals("android.intent.action.SEND") : iHashCode == -58484670 && action.equals("android.intent.action.SEND_MULTIPLE")));
    }

    public final void e(zsa zsaVar, List list) {
        x77 x77Var = (x77) this.f.remove(zsaVar);
        if (x77Var != null) {
            x77Var.cancel(null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.e.i(((bta) it.next()).a);
        }
        this.i = false;
    }

    public final void f(long j) {
        bta btaVar = (bta) this.e.f(cta.MAIN_ACTIVITY_INIT_TO_RENDER);
        if (btaVar != null) {
            if (btaVar.e != -1) {
                btaVar = null;
            }
            if (btaVar != null) {
                btaVar.e = j - btaVar.b;
            }
        }
    }
}
