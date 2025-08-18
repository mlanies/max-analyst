package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;
import one.me.rlottie.RLottieImageView;
import one.me.sdk.concurrent.watchdog.ThreadExecutorStuckException;
import ru.ok.messages.contacts.profile.ActContactAvatars;
import ru.ok.messages.views.ActProfilePhoto;

/* loaded from: classes2.dex */
public final /* synthetic */ class jh2 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ jh2(long j, int i) {
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        StackTraceElement[] stackTrace;
        e5f e5fVar = e5f.a;
        int i = 0;
        long j = this.b;
        switch (this.a) {
            case 0:
                u82 u82Var = (u82) obj;
                x82 x82Var = u82Var.r;
                if (x82Var == null) {
                    x82Var = x82.g;
                }
                w82 w82VarA = x82Var.a();
                w82VarA.c = j;
                u82Var.r = w82VarA.a();
                return e5fVar;
            case 1:
                return Long.valueOf(j);
            case 2:
                return Boolean.valueOf(((e52) obj).b.a == j);
            case 3:
                Context context = (Context) obj;
                int i2 = ActProfilePhoto.Y0;
                e52 e52Var = (e52) ((jz2) ((iy2) ((y8a) ((ed3) vl.o.c.getValue())).getAccessor().c(iy2.class))).m(j).a.getValue();
                if (e52Var != null) {
                    kk0 kk0Var = kk0.c;
                    jk0 jk0Var = jk0.a;
                    k92 k92Var = e52Var.b;
                    k92Var.b(kk0Var, jk0Var);
                    String str = k92Var.i;
                    if (!oag.t(str)) {
                        ju0.t(str, kk0.X, jk0.b);
                    }
                    e6 e6Var = new e6(nu0.l(new c6(e52Var, i)), e52Var.q());
                    Intent intent = new Intent(context, (Class<?>) ActProfilePhoto.class);
                    intent.putExtra("ru.ok.tamtam.extra.PHOTO_HOLDER", e6Var);
                    context.startActivity(intent);
                }
                return e5fVar;
            case 4:
                Context context2 = (Context) obj;
                int i3 = ActContactAvatars.h1;
                Intent intent2 = new Intent(context2, (Class<?>) ActContactAvatars.class);
                intent2.putExtra("ru.ok.tamtam.extra.CONTACT_ID", j);
                context2.startActivity(intent2);
                return e5fVar;
            case 5:
                return Boolean.valueOf(tpa.f(tpa.v((RLottieImageView) obj, wxb.tag_reaction_effects_view), Long.valueOf(j)));
            case 6:
                return Boolean.valueOf(((gza) obj).a == j);
            default:
                urf urfVar = (urf) obj;
                int i4 = ThreadExecutorStuckException.a;
                StringBuilder sb = new StringBuilder("WatchdogTask(\n\tsubmitThread='");
                sb.append(urfVar.a);
                sb.append("',\n\trunningThread='");
                String strN0 = null;
                Thread thread = urfVar.d;
                String name = thread != null ? thread.getName() : null;
                if (name == null) {
                    name = "";
                }
                sb.append(name);
                long jB = urfVar.b(j);
                int i5 = ft4.o;
                if (ft4.c(jB, z7.R(0, kt4.NANOSECONDS)) > 0) {
                    sb.append("',\n\texecutionTime=");
                    sb.append(ft4.e(jB));
                }
                long j2 = urfVar.c;
                long j3 = urfVar.b;
                if (!ft4.d(j2, j3)) {
                    j = j2;
                }
                long jE = ft4.e(ft4.g(j, j3));
                if (jE > 0) {
                    sb.append(",\n\tqueueTime=");
                    sb.append(jE);
                }
                if (thread != Thread.currentThread()) {
                    sb.append(",\n\tstate=" + (thread != null ? thread.getState() : null));
                    sb.append(",\n\tlocked_stacktrace=\n");
                    if (thread != null && (stackTrace = thread.getStackTrace()) != null) {
                        ArrayList arrayList = new ArrayList();
                        for (StackTraceElement stackTraceElement : stackTrace) {
                            if (!eae.o0(stackTraceElement.getClassName(), "java.util.concurrent", false) && !eae.o0(stackTraceElement.getClassName(), "kotlinx.coroutines", false)) {
                                arrayList.add(stackTraceElement);
                            }
                        }
                        strN0 = x53.n0(x53.y0(arrayList, 3), "\n\t\t\t", "\t\t", null, null, 60);
                    }
                    sb.append(strN0);
                }
                List list = urfVar.e;
                if (!list.isEmpty()) {
                    sb.append("\n\tsubmit_stacktrace=\n\t");
                    sb.append(x53.n0(x53.y0(list, 5), "\n\t\t", null, null, null, 62));
                }
                sb.append("\n)");
                return sb.toString();
        }
    }
}
