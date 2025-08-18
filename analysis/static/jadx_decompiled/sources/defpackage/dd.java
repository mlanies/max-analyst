package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import one.me.android.concurrent.SingleCoreActivity;

/* loaded from: classes.dex */
public final class dd implements pi4 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public dd(je7 je7Var, je7 je7Var2, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = je7Var;
                this.c = je7Var2;
                this.d = new w7c(r0e.a(Collections.singletonList(new b54(ei4.b.incrementAndGet(), new iqe("Пуши заново"), woc.P1, null, null, 24))));
                break;
            default:
                long jIncrementAndGet = ei4.b.incrementAndGet();
                this.b = je7Var;
                this.c = je7Var2;
                this.d = new w7c(r0e.a(Collections.singletonList(new b54(jIncrementAndGet, new iqe("Отправить аналитику"), woc.V, null, null, 24))));
                break;
        }
    }

    @Override // defpackage.pi4
    public final j0e c() {
        switch (this.a) {
            case 0:
                return (w7c) this.d;
            case 1:
                return (w7c) this.d;
            default:
                return (q0e) this.c;
        }
    }

    @Override // defpackage.pi4
    public final void d(b54 b54Var) {
        switch (this.a) {
            case 0:
                js7.g((js7) ((je7) this.c).getValue(), true, 2);
                wha whaVar = (wha) ((je7) this.b).getValue();
                whaVar.h("Логи отправлены");
                whaVar.i();
                break;
            case 1:
                gi9 gi9Var = new gi9((Object) null);
                Iterator it = ((p82) ((je7) this.b).getValue()).x(null).iterator();
                while (it.hasNext()) {
                    e52 e52Var = (e52) it.next();
                    if (e52Var.b.m > 0) {
                        gi9Var.a(e52Var.a);
                    }
                }
                ((cea) ((je7) this.c).getValue()).g(gi9Var);
                break;
            default:
                hm9.n(mqd.class.getName(), "switch");
                Context context = (Context) this.b;
                try {
                    context.getPackageManager().setComponentEnabledSetting(new ComponentName("ru.oneme.app", SingleCoreActivity.class.getName()), mqd.s(context) ? 2 : 1, 1);
                } catch (Throwable th) {
                    hm9.p(mqd.class.getName(), "fail to update component state", th);
                }
                ((q0e) this.c).m(null, e());
                wha whaVar2 = (wha) ((v4) this.d).c(wha.class);
                whaVar2.h("Перезапустите приложение");
                whaVar2.b("Для применения конфига перезапустите приложение");
                whaVar2.i();
                break;
        }
    }

    public List e() {
        SpannedString spannedString;
        boolean zS = mqd.s((Context) this.b);
        long jIncrementAndGet = ei4.b.incrementAndGet();
        iqe iqeVar = new iqe("Включить single-core mode");
        if (zS) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            tpa.e(spannableStringBuilder, "включено‼️", new zx5(-65536));
            spannedString = new SpannedString(spannableStringBuilder);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            tpa.e(spannableStringBuilder2, "выключено", new zx5(Color.parseColor("#4CAF50")));
            spannedString = new SpannedString(spannableStringBuilder2);
        }
        return Collections.singletonList(new b54(jIncrementAndGet, iqeVar, 0, new iqe(spannedString), new a54(zS), 4));
    }

    public dd(v4 v4Var) {
        this.a = 2;
        this.d = v4Var;
        this.b = (Context) v4Var.c(Context.class);
        this.c = r0e.a(e());
    }
}
