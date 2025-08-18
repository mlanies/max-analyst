package defpackage;

import android.content.Context;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class g implements b37 {
    public final /* synthetic */ int a;

    public /* synthetic */ g(int i) {
        this.a = i;
    }

    @Override // defpackage.b37
    public final Object a(v4 v4Var) {
        switch (this.a) {
            case 0:
                return j.a;
            case 1:
                return new r7d(PmsKey.f78mediaorder, new String[]{"0 - Медиа всегда снизу", "1 - Медиа всегда сверху", "2 - Медиа сверху только в постах каналов", "3 - Порядок управляется с бека"});
            case 2:
                return qp.a;
            case 3:
                return new gdb(1, v4Var.d(qe5.class));
            case 4:
                return new e7d("Включить новый экран оформления", PmsKey.f6appearancemultithemescreenenabled, false);
            case 5:
                return new e7d("📞 Зал ожидания в групповых звонках", PmsKey.gcwre, false);
            case 6:
                khe kheVarD = v4Var.d(q33.class);
                return new hp7(new iqe("📞 Логгирование WebRtc в звонках"), new e11(0, (q33) kheVarD.getValue(), q33.class, "isWebRtcLoggingEnabled", "isWebRtcLoggingEnabled()Z", 0, 0), new f(1, (q33) kheVarD.getValue(), q33.class, "setWebRtcLoggingEnabled", "setWebRtcLoggingEnabled(Z)V", 0, 3), ztb.ic_call_22, 16);
            case 7:
                return new e7d("📞 Чат в групповом звонке", PmsKey.f44groupcallchatsupport, false);
            case 8:
                return new f11(0);
            case 9:
                return r41.a;
            case 10:
                return new e7d("📞 Шеринг в 1-1", PmsKey.sse, false);
            case 11:
                return new e7d("📞 Отображение VPN снекбара", PmsKey.f115showvpnsnackbar, false);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new e7d("📞 Шеринг в групповом", PmsKey.gsse, false);
            case 13:
                return new e7d("📞 Групповые звонки", PmsKey.gce, false);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new e7d("📞 Групповые звонки: пермишен участников чата", PmsKey.gcmpe, false);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new e7d("📞 Запись звонка", PmsKey.grse, false);
            case 16:
                return new e7d("📞 Групповые звонки по ссылке", PmsKey.lgce, false);
            case LangUtils.HASH_SEED /* 17 */:
                return new e7d("📞 Админские настройки в групповых звонках", PmsKey.gcas, false);
            case 18:
                return u71.a;
            case 19:
                return new n92(v4Var.d(qe5.class), v4Var.d(zrc.class));
            case 20:
                return new e7d(PmsKey.f19chatanim);
            case 21:
                return new dj5((av0) v4Var.c(av0.class), (kke) v4Var.c(kke.class));
            case 22:
                return new peb(1, v4Var.d(qe5.class));
            case 23:
                return new e7d("Превью видео при перемотке", PmsKey.f80mediaviewervideocollageenabled, false);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new s26(v4Var.d(kv6.class), v4Var.d(gta.class), v4Var.d(kke.class));
            case 25:
                return lz2.a;
            case 26:
                return new ie8(9);
            case 27:
                return new kz2((Context) v4Var.c(Context.class), (u7b) v4Var.c(u7b.class), (w7b) v4Var.c(w7b.class));
            case 28:
                return new nzc((Context) v4Var.c(Context.class), (ida) v4Var.c(ida.class), (lr2) v4Var.c(lr2.class), (uba) v4Var.c(uba.class), (iy2) v4Var.c(iy2.class), (w7b) v4Var.c(w7b.class), (q33) v4Var.c(q33.class), v4Var.d(y7d.class));
            default:
                return la3.b;
        }
    }
}
