package defpackage;

import android.content.Context;
import android.view.View;
import java.util.Map;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class g27 implements m56 {
    public final /* synthetic */ int a;

    public /* synthetic */ g27(int i) {
        this.a = i;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        String str;
        switch (this.a) {
            case 0:
                return ote.s(((TamErrorException) obj).a);
            case 1:
                return Boolean.valueOf(eae.o0((String) ((Map.Entry) obj).getKey(), "MP4", false));
            case 2:
                return new ef5(3, (String) ((Map.Entry) obj).getValue());
            case 3:
                return Boolean.valueOf(eae.o0((String) ((Map.Entry) obj).getKey(), "MP4", false));
            case 4:
                Map.Entry entry = (Map.Entry) obj;
                return new df5(3, -1, f46.Q((String) entry.getKey()), 0, (String) entry.getValue());
            case 5:
                pke pkeVar = ((TamErrorException) obj).a;
                c67.E0.getClass();
                if (pkeVar instanceof gke) {
                    String str2 = ((gke) pkeVar).b;
                    return (tpa.f(str2, "service.unavailable") || tpa.f(str2, "service.timeout")) ? new h57(new eqe(yoc.R), new eqe(yoc.Q)) : new h57(new eqe(yoc.P), new eqe(yoc.O));
                }
                String str3 = pkeVar.b;
                if (tpa.f(str3, "contact.not.found") || tpa.f(str3, "not.found")) {
                    return i57.a;
                }
                if (tpa.f(str3, "too.many.requests")) {
                    return j57.a;
                }
                String str4 = pkeVar.o;
                return new g57((str4 == null || str4.length() == 0) ? new eqe(jpc.F) : new iqe(str4));
            case 6:
                return ((zp7) obj).b;
            case 7:
                ms7 ms7Var = (ms7) obj;
                String str5 = ms7Var.d;
                return new ps7(1, 0L, ms7Var, tpa.f(str5, "COLD_START") || tpa.f(str5, "WARM_START"));
            case 8:
                return obj.toString();
            case 9:
                return Long.toString(((Long) obj).longValue());
            case 10:
                return e5f.a;
            case 11:
                return new EnhancedAnimatedVectorDrawable((Context) obj, vca.b);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new EnhancedAnimatedVectorDrawable((Context) obj, vca.d);
            case 13:
                return Long.valueOf(((kn8) obj).a);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                uj3 uj3Var = (uj3) obj;
                if (!uj3Var.Y && !i24.r(uj3Var) && uj3Var.k() == 0 && (!uj3Var.t() || !uj3Var.v())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return ((pxa) obj).c.toString();
            case 16:
                return ((pxa) obj).c.toString();
            case LangUtils.HASH_SEED /* 17 */:
                return Boolean.valueOf(((View) obj).isClickable());
            case 18:
                return new dcf(0, ((fka) obj).getIcon().a.e);
            case 19:
                return new iw8((Context) obj);
            case 20:
                return Boolean.valueOf(((hx8) obj).a.a == d6c.c);
            case 21:
                bc7[] bc7VarArr = MessageWriteWidget.F0;
                return new dcf(0, ((fka) obj).getIcon().a.e);
            case 22:
                return Boolean.valueOf(((gs8) obj) == gs8.Z);
            case 23:
                rw8 rw8Var = (rw8) obj;
                return new sx9(rw8Var.c, rw8Var.e, rw8Var.i, ks4.MESSAGES_LIMIT);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                rw8 rw8Var2 = (rw8) obj;
                return new sx9(rw8Var2.c, rw8Var2.e, rw8Var2.i, ks4.NOTIFICATIONS_LIMIT);
            case 25:
                return Boolean.valueOf(((ql2) obj).f.isEmpty());
            case 26:
                return ((rw8) obj).l;
            case 27:
                dv9 dv9Var = (dv9) obj;
                return Boolean.valueOf((!dv9Var.b || (str = dv9Var.a) == null || str.length() == 0) ? false : true);
            case 28:
                return ((dx8) obj).b.b;
            default:
                return Boolean.valueOf(((yq3) obj).a == 5);
        }
    }
}
