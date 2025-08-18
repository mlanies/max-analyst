package defpackage;

import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.sdk.arch.Widget;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class it7 implements b37 {
    public final /* synthetic */ int a;

    public /* synthetic */ it7(int i) {
        this.a = i;
    }

    @Override // defpackage.b37
    public final Object a(v4 v4Var) {
        switch (this.a) {
            case 0:
                return mt7.a;
            case 1:
                return new ie8(7);
            case 2:
                return new lr3(1, v4Var.d(tmc.class));
            case 3:
                return new ie8(0);
            case 4:
                return q89.a;
            case 5:
                return new ie8(8);
            case 6:
                return new e7d("Включить Webm стикеры", PmsKey.f134webmstickersenabled, true);
            case 7:
                return new e7d("Аналитика", PmsKey.f3analyticsenabled, true);
            case 8:
                return (qu7) v4Var.c(djc.class);
            case 9:
                return new e7d(PmsKey.f93newsessionlogic);
            case 10:
                return new p6a(v4Var.d(qe5.class));
            case 11:
                v4Var.d(nl0.class);
                return new f11(2);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return g97.a;
            case 13:
                return li7.a;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return m95.a;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return (qu7) v4Var.c(and.class);
            case 16:
                return (qu7) v4Var.c(zf0.class);
            case LangUtils.HASH_SEED /* 17 */:
                return new h6a(v4Var, 0);
            case 18:
                return new k6a(v4Var);
            case 19:
                return ul9.a;
            case 20:
                return new e6a(v4Var);
            case 21:
                return (al) v4Var.c(fl7.class);
            case 22:
                np npVar = np.a;
                np.b = v4Var.d(z7d.class);
                return npVar;
            case 23:
                return op.a;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                coc cocVar = (coc) x53.q0(((haa) v4Var.c(haa.class)).f().C().e());
                return new wha((Widget) (cocVar != null ? cocVar.a : null));
            case 25:
                return new wj7(v4Var.d(vj7.class));
            case 26:
                return o6a.a;
            case 27:
                return new gdb(0, v4Var.d(qe5.class));
            case 28:
                q33 q33Var = (q33) v4Var.c(q33.class);
                return new hp7(new iqe("Отображение debug info в профиле"), new e09(0, q33Var, q33.class, "isDebugProfileInfoEnabled", "isDebugProfileInfoEnabled()Z", 0, 5), new om8(1, q33Var, q33.class, "setDebugProfileInfoEnabled", "setDebugProfileInfoEnabled(Z)V", 0, 11), woc.Z0, 16);
            default:
                return new e7d("Включить видеосообщения", PmsKey.f128videomsgenabled, false);
        }
    }
}
