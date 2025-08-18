package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;
import java.lang.Thread;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class lr1 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ lr1(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.o = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        SpannableString spannableStringU;
        boolean z = false;
        int i = 1;
        switch (this.a) {
            case 0:
                k56 k56Var = ((lyd) this.o).d;
                if (k56Var != null) {
                    k56Var.invoke();
                }
                z31 z31Var = (z31) ((mec) this.b).a;
                if (z31Var != null) {
                    ((wr1) this.c).g(z31Var);
                }
                return e5f.a;
            case 1:
                hm9.n("CallEngineTag", ((sx3) this.o) + " conversation for answer is created " + ((Conversation) obj).getConversationId());
                z31 z31Var2 = (z31) ((mec) this.b).a;
                if (z31Var2 != null) {
                    bc7[] bc7VarArr = wr1.K;
                    ((wr1) this.c).g(z31Var2);
                }
                return e5f.a;
            case 2:
                ((l53) this.o).U0.invoke(new e19((f53) this.b, ((MessageModel) this.c).a, (String) obj));
                return e5f.a;
            case 3:
                ((l53) this.o).U0.invoke(new e19((f53) this.b, ((MessageModel) this.c).a, (String) obj));
                return e5f.a;
            case 4:
                w6b w6bVarH = ((ida) this.o).h((String) obj);
                return new w6b(ema.v(qp4.u0.b((Context) this.c).i(), w6bVarH, ema.s(w6bVarH.a.toString(), ((vpb) this.b).b)), w6bVarH.b);
            case 5:
                pl8 pl8Var = (pl8) this.o;
                ml8 ml8Var = (ml8) this.b;
                dd3 dd3Var = (dd3) this.c;
                bi4 bi4Var = (bi4) obj;
                String str = (String) pl8Var.b;
                ir6 ir6Var = hm9.m;
                if (ir6Var != null && ir6Var.c()) {
                    ir6Var.d(us7.X, str, "executeWithDetachableLooper", null);
                }
                String str2 = ((el8) pl8Var.c).c;
                h1f h1fVarU = pl8Var.u(pl8Var.r(ml8Var), new ol8(ml8Var, pl8Var, bi4Var, 0));
                khe kheVar = bi4.c;
                Handler handler = new Handler(bi4Var.b, null);
                ((el8) pl8Var.c).getClass();
                ((el8) pl8Var.c).getClass();
                hl8 hl8Var = new hl8(handler, h1fVarU, 500L, 300000L, (wz7) ((el8) pl8Var.c).l);
                try {
                    h1fVarU.e(dd3Var, str2);
                    hl8Var.b();
                    String str3 = (String) pl8Var.b;
                    ir6 ir6Var2 = hm9.m;
                    if (ir6Var2 != null && ir6Var2.c()) {
                        ir6Var2.d(us7.X, str3, "executeWithDetachableLooper, starting loop ...", null);
                    }
                } finally {
                    try {
                        return e5f.a;
                    } finally {
                    }
                }
                if (!tpa.f(bi4Var.b.getThread(), Thread.currentThread())) {
                    throw new IllegalStateException("Illegal thread".toString());
                }
                Looper.loop();
                String str4 = (String) pl8Var.b;
                ir6 ir6Var3 = hm9.m;
                if (ir6Var3 != null && ir6Var3.c()) {
                    ir6Var3.d(us7.X, str4, "executeWithDetachableLooper, loop completed", null);
                }
                return e5f.a;
            case 6:
                uj3 uj3Var = (uj3) obj;
                if (!uj3Var.w() && !((List) this.o).contains(uj3Var) && uj3Var.n() != ((hyc) ((jq8) ((mec) this.b).a).Y).t() && uj3Var.n() == ((cu8) this.c).Y) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 7:
                yy7 yy7Var = (yy7) obj;
                yy7Var.a = (e52) this.o;
                yy7Var.c = (cu8) this.b;
                yy7Var.e = (u6b) this.c;
                return e5f.a;
            case 8:
                String str5 = (String) obj;
                TextView textView = (TextView) this.o;
                String str6 = (String) this.b;
                if (textView != null) {
                    jyc jycVar = jyc.a;
                    List<String> listE = jycVar.r().e(str5, str6);
                    String strE = bre.e(str5);
                    if (strE != null && strE.length() != 0 && textView.getPaint().measureText(strE) > textView.getMeasuredWidth()) {
                        String[] strArrL = jycVar.r().l(strE);
                        if (!oag.t(strE) && !nd7.D(listE) && strArrL != null && strArrL.length != 0) {
                            int i2 = 0;
                            while (true) {
                                if (i2 < strArrL.length) {
                                    for (String str7 : listE) {
                                        if (!oag.t(str7) && strArrL[i2].regionMatches(true, 0, str7, 0, str7.length())) {
                                            int iIndexOf = strE.indexOf(strArrL[i2]);
                                            if (i2 != 0 && iIndexOf > 10) {
                                                strE = "…" + strE.substring(Math.max(0, iIndexOf - 10));
                                            }
                                        }
                                    }
                                    i2++;
                                }
                            }
                        }
                    }
                    spannableStringU = ema.u(strE, jyc.a.r().d(strE.toString(), listE), qp4.u0.j(textView));
                } else {
                    String strE2 = bre.e(str5);
                    jyc jycVar2 = jyc.a;
                    spannableStringU = ema.u(strE2, jycVar2.r().d(strE2.toString(), jycVar2.r().e(strE2, str6)), (fka) this.c);
                }
                return jyc.a.o().j.e(spannableStringU);
            case 9:
                Integer num = (Integer) this.c;
                int iIntValue = num != null ? num.intValue() : 5;
                bkb bkbVar = (bkb) this.b;
                return new ika((String) this.o, (Thread.UncaughtExceptionHandler) bkbVar.a, iIntValue, (vse) ((k56) bkbVar.b).invoke());
            case 10:
                return ((v6b) ((t6b) this.o).b.getValue()).a((e52) this.c, (cu8) this.b);
            case 11:
                alc alcVar = (alc) this.o;
                alcVar.getClass();
                return alc.f(alcVar, (List) this.b, (Set) this.c, (Continuation) obj);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                View view = (View) this.o;
                float translationY = 1 - (view.getTranslationY() / (fk4.d().getDisplayMetrics().density * 4.0f));
                float translationY2 = view.getTranslationY() == 0.0f ? fk4.d().getDisplayMetrics().density * 4.0f : view.getTranslationY();
                float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(translationY2, 0.0f);
                valueAnimatorOfFloat.setDuration((long) (200 * translationY));
                valueAnimatorOfFloat.setInterpolator(rwc.x0);
                valueAnimatorOfFloat.addListener(new f60((rwc) this.b, (lwc) this.c, view, i));
                valueAnimatorOfFloat.addUpdateListener(new pmc(view, animatedFraction, 1));
                valueAnimatorOfFloat.start();
                return valueAnimatorOfFloat;
            default:
                ((c66) this.o).invoke((View) obj, (w9f) this.b, Integer.valueOf(((y9f) this.c).h()));
                return e5f.a;
        }
    }

    public /* synthetic */ lr1(String str, fka fkaVar) {
        this.a = 8;
        this.o = null;
        this.b = str;
        this.c = fkaVar;
    }
}
