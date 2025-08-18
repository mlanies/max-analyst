package defpackage;

import android.content.Context;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class n7b extends brd {
    public final /* synthetic */ int b;

    public /* synthetic */ n7b(int i) {
        this.b = i;
    }

    @Override // defpackage.brd
    public final Object b(v4 v4Var) {
        switch (this.b) {
            case 0:
                return new g80((Context) v4Var.c(Context.class), "auth.prefs", (mi5) v4Var.c(mi5.class));
            case 1:
                return new p7b((t33) v4Var.c(t33.class), (z7d) v4Var.c(z7d.class), (jp) v4Var.c(jp.class), (g80) v4Var.c(g80.class), (se5) v4Var.c(se5.class));
            case 2:
                return (m7b) v4Var.c(p7b.class);
            case 3:
                return new jp((Context) v4Var.c(Context.class), (mi5) v4Var.c(mi5.class));
            case 4:
                return (kxc) v4Var.c(jp.class);
            case 5:
                return (hp) v4Var.c(jp.class);
            case 6:
                return new z7d((Context) v4Var.c(Context.class), (mi5) v4Var.c(mi5.class));
            case 7:
                return (qyc) v4Var.c(z7d.class);
            case 8:
                return (y7d) v4Var.c(z7d.class);
            case 9:
                Context context = (Context) v4Var.c(Context.class);
                mi5 mi5Var = (mi5) v4Var.c(mi5.class);
                qyc qycVar = (qyc) v4Var.c(qyc.class);
                se5 se5Var = new se5(context, mi5Var, qycVar);
                qycVar.l.add(se5Var);
                se5Var.i = new fic(new re5(qycVar, 0));
                return se5Var;
            case 10:
                return (oyc) v4Var.c(se5.class);
            case 11:
                return (qe5) v4Var.c(se5.class);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return ((k24) ((c34) v4Var.c(c34.class))).c;
            case 13:
                return ((k24) ((c34) v4Var.c(c34.class))).b;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return ((k24) ((c34) v4Var.c(c34.class))).h;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return ((k24) ((c34) v4Var.c(c34.class))).g;
            case 16:
                return ((k24) ((c34) v4Var.c(c34.class))).j;
            case LangUtils.HASH_SEED /* 17 */:
                return ((k24) ((c34) v4Var.c(c34.class))).k;
            case 18:
                return ((k24) ((c34) v4Var.c(c34.class))).l;
            case 19:
                return ((k24) ((c34) v4Var.c(c34.class))).i;
            case 20:
                return ((k24) ((c34) v4Var.c(c34.class))).m;
            case 21:
                return ((k24) ((c34) v4Var.c(c34.class))).n;
            case 22:
                return new jbd(v4Var.d(gh3.class), (o45) v4Var.c(o45.class), v4Var.d(ri4.class));
            case 23:
                return ((k24) ((c34) v4Var.c(c34.class))).p;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return ((k24) ((c34) v4Var.c(c34.class))).q;
            case 25:
                return ((k24) ((c34) v4Var.c(c34.class))).r;
            case 26:
                return ((k24) ((c34) v4Var.c(c34.class))).s;
            case 27:
                return ((k24) ((c34) v4Var.c(c34.class))).t;
            case 28:
                return ((k24) ((c34) v4Var.c(c34.class))).o;
            default:
                return ((k24) ((c34) v4Var.c(c34.class))).u;
        }
    }
}
