package defpackage;

import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class dcb implements b37 {
    public final /* synthetic */ int a;

    public /* synthetic */ dcb(int i) {
        this.a = i;
    }

    @Override // defpackage.b37
    public final Object a(v4 v4Var) {
        switch (this.a) {
            case 0:
                return new e7d("Включить новый экран просмотра аватарок", PmsKey.f9avatarsscreenenabled, false);
            case 1:
                return new peb(0, v4Var.d(y7d.class));
            case 2:
                return new e7d("Пункт \"Тип канала и ссылка\" (при редактировании канала)", PmsKey.f33editchanneltypescreenenabled, false);
            case 3:
                return new e7d("Пункт \"Тип чата и ссылка\" (при редактировании чата)", PmsKey.f34editchattypescreenenabled, false);
            case 4:
                return new e7d("Включить права на управления ссылкой в чате", PmsKey.f22chatinvitelinkpermissionsenabled, false);
            case 5:
                return new e7d("Новые пермишены для админов", PmsKey.f91newadminpermissions, false);
            case 6:
                return ((se5) ((qe5) v4Var.c(qe5.class))).t() ? new vkb(v4Var.d(u7b.class), v4Var.d(y7b.class), v4Var.d(ds3.class), v4Var.d(qe5.class), v4Var.d(q33.class)) : new ndb(v4Var.d(u7b.class), v4Var.d(y7b.class), v4Var.d(qe5.class));
            case 7:
                return (qu7) v4Var.c(rw9.class);
            case 8:
                return (qu7) v4Var.c(jva.class);
            case 9:
                return (qu7) v4Var.c(eqb.class);
            case 10:
                return (qu7) v4Var.c(kw9.class);
            case 11:
                return (qu7) v4Var.c(n79.class);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return (qu7) v4Var.c(ew9.class);
            case 13:
                return (qu7) v4Var.c(ud5.class);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return (qu7) v4Var.c(le5.class);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return (qu7) v4Var.c(yx9.class);
            case 16:
                return (qu7) v4Var.c(ga4.class);
            case LangUtils.HASH_SEED /* 17 */:
                return new h6a(v4Var, 1);
            case 18:
                return (qu7) v4Var.c(ks1.class);
            case 19:
                return (qu7) v4Var.c(js7.class);
            case 20:
                return (qu7) v4Var.c(u7b.class);
            case 21:
                return (qu7) v4Var.c(jz2.class);
            case 22:
                return (qu7) v4Var.c(xb9.class);
            case 23:
                return (qu7) v4Var.c(dr9.class);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return (qu7) v4Var.c(a4e.class);
            case 25:
                return (qu7) v4Var.c(sc5.class);
            case 26:
                return (qu7) v4Var.c(ta2.class);
            case 27:
                return ((OneMeRoomDatabase) ((pfa) v4Var.c(pfa.class)).m()).W();
            case 28:
                return new sj6((v7g) v4Var.c(v7g.class));
            default:
                return new cw9((v7g) v4Var.c(v7g.class));
        }
    }
}
