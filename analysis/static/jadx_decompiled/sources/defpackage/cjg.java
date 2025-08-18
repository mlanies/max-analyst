package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import kotlin.NoWhenBranchMatchedException;
import one.me.calls.ui.ui.call.panels.VpnPanelWidget;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.android.webrtc.protocol.exceptions.RtcNotificationSerializeException;

/* loaded from: classes.dex */
public final class cjg implements lp, qj3, e1d, bha, tge, l3a {
    public static cjg o;
    public Object a;
    public Object b;
    public Object c;

    public /* synthetic */ cjg(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public static final SharedPreferences i(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void j(Context context) throws wig {
        SharedPreferences sharedPreferencesI = i(context);
        if (sharedPreferencesI.edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            return;
        }
        String strValueOf = String.valueOf(context.getPackageName());
        if (strValueOf.length() != 0) {
            "Failed to store app set ID last used time for App ".concat(strValueOf);
        }
        throw new wig("Failed to store the app set ID last used time.");
    }

    @Override // defpackage.bha
    public void I(CharSequence charSequence) {
        bha bhaVar = ((xka) ((yka) this.c)).a;
        if (bhaVar != null) {
            bhaVar.I(charSequence);
        }
    }

    @Override // defpackage.bha
    public void U() {
        int iIntValue;
        int iIntValue2;
        ala alaVar = (ala) this.b;
        if (alaVar != null) {
            cla claVar = alaVar.a;
            claVar.F0 = false;
            int iOrdinal = claVar.getForm().ordinal();
            if (iOrdinal == 0) {
                kpa actionsHorizontalPadding = claVar.getActionsHorizontalPadding();
                iIntValue = actionsHorizontalPadding != null ? ((Number) actionsHorizontalPadding.a).intValue() : tu0.G(12 * fk4.d().getDisplayMetrics().density);
            } else if (iOrdinal == 1) {
                kpa actionsHorizontalPadding2 = claVar.getActionsHorizontalPadding();
                iIntValue = actionsHorizontalPadding2 != null ? ((Number) actionsHorizontalPadding2.a).intValue() : tu0.G(16 * fk4.d().getDisplayMetrics().density);
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                kpa actionsHorizontalPadding3 = claVar.getActionsHorizontalPadding();
                iIntValue = actionsHorizontalPadding3 != null ? ((Number) actionsHorizontalPadding3.a).intValue() : tu0.G(4 * fk4.d().getDisplayMetrics().density);
            }
            int iOrdinal2 = claVar.getForm().ordinal();
            if (iOrdinal2 == 0) {
                kpa actionsHorizontalPadding4 = claVar.getActionsHorizontalPadding();
                iIntValue2 = actionsHorizontalPadding4 != null ? ((Number) actionsHorizontalPadding4.b).intValue() : tu0.G(12 * fk4.d().getDisplayMetrics().density);
            } else if (iOrdinal2 == 1) {
                kpa actionsHorizontalPadding5 = claVar.getActionsHorizontalPadding();
                iIntValue2 = actionsHorizontalPadding5 != null ? ((Number) actionsHorizontalPadding5.b).intValue() : tu0.G(12 * fk4.d().getDisplayMetrics().density);
            } else {
                if (iOrdinal2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                kpa actionsHorizontalPadding6 = claVar.getActionsHorizontalPadding();
                iIntValue2 = actionsHorizontalPadding6 != null ? ((Number) actionsHorizontalPadding6.b).intValue() : tu0.G(4 * fk4.d().getDisplayMetrics().density);
            }
            claVar.setPadding(iIntValue, claVar.getPaddingTop(), iIntValue2, claVar.getPaddingBottom());
            View view = claVar.C0;
            if (view instanceof eha) {
                if (view != null) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMarginEnd(tu0.G(12 * fk4.d().getDisplayMetrics().density));
                    view.setLayoutParams(marginLayoutParams);
                }
                View view2 = claVar.B0;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
            }
            TextView textView = claVar.u0;
            textView.setVisibility(0);
            textView.setWidth(textView.getMeasuredWidth());
            je7 je7Var = claVar.v0;
            if (je7Var.a()) {
                fmd fmdVar = (fmd) je7Var.getValue();
                boolean z = fmdVar.getVisibility() == 0;
                boolean z2 = claVar.E0;
                if (z != z2) {
                    fmdVar.setVisibility(z2 ? 0 : 8);
                    bc7 bc7Var = cla.H0[5];
                    fmdVar.a(((Boolean) claVar.t0.b).booleanValue());
                    claVar.l();
                }
            }
            je7 je7Var2 = claVar.w0;
            if (je7Var2.a()) {
                ((s5a) je7Var2.getValue()).setVisibility(0);
            }
            je7 je7Var3 = claVar.x0;
            if (je7Var3.a()) {
                ((ImageView) je7Var3.getValue()).setVisibility(0);
            }
            OneMeButton oneMeButton = claVar.A0;
            if (oneMeButton != null) {
                oneMeButton.setVisibility(0);
            }
        }
        bha bhaVar = ((xka) ((yka) this.c)).a;
        if (bhaVar != null) {
            bhaVar.U();
        }
    }

    public void a() {
        ObjectAnimator objectAnimator = (ObjectAnimator) this.b;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.a;
        if (view.getAlpha() < 1.0f) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 1.0f);
            objectAnimatorOfFloat.setDuration(500L);
            objectAnimatorOfFloat.setInterpolator((AccelerateDecelerateInterpolator) this.c);
            objectAnimatorOfFloat.start();
            this.b = objectAnimatorOfFloat;
        }
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        hm9.n(gn4.i, "MsgGetCmd success");
        ((gn4) this.a).c((e52) this.b, (n7d) this.c);
    }

    public ooc b(int i, byte[] bArr) throws RtcNotificationSerializeException {
        if (i == 0) {
            throw new RtcNotificationSerializeException(new IllegalArgumentException("Illegal 'format' value: null"));
        }
        if (i != 2) {
            throw new RtcNotificationSerializeException(new UnsupportedOperationException("Only binary format is supported"));
        }
        try {
            gy8 gy8VarA = vw8.a(bArr);
            try {
                int iV0 = gy8VarA.v0();
                int i2 = 0;
                o9g o9gVar = (o9g) this.a;
                switch (iV0) {
                    case 1:
                        int iX0 = gy8VarA.x0();
                        HashMap map = new HashMap();
                        while (i2 < iX0) {
                            fp1 fp1VarZ = f46.Z(gy8VarA.z0());
                            int iV02 = gy8VarA.v0();
                            if (fp1VarZ != null) {
                                map.put(Integer.valueOf(iV02), fp1VarZ);
                            }
                            i2++;
                        }
                        ((ConcurrentHashMap) o9gVar.b).putAll(map);
                        gt6 gt6Var = new gt6(map);
                        gy8VarA.close();
                        return gt6Var;
                    case 2:
                        int iS0 = gy8VarA.s0();
                        ArrayList arrayList = new ArrayList();
                        while (i2 < iS0) {
                            bg1 bg1VarC = o9gVar.C(gy8VarA.v0());
                            if (bg1VarC != null) {
                                arrayList.add(bg1VarC);
                            }
                            i2++;
                        }
                        u20 u20Var = new u20();
                        u20Var.a = arrayList;
                        gy8VarA.close();
                        return u20Var;
                    case 3:
                        bg1 bg1VarC2 = o9gVar.C(gy8VarA.v0());
                        lvd lvdVar = new lvd();
                        if (bg1VarC2 == null) {
                            throw new IllegalArgumentException("Illegal 'speaker' value: null");
                        }
                        lvdVar.a = bg1VarC2;
                        gy8VarA.close();
                        return lvdVar;
                    case 4:
                        int iS02 = gy8VarA.s0();
                        ArrayList arrayList2 = new ArrayList();
                        while (i2 < iS02) {
                            bg1 bg1VarC3 = o9gVar.C(gy8VarA.v0());
                            if (bg1VarC3 != null) {
                                arrayList2.add(bg1VarC3);
                            }
                            i2++;
                        }
                        sxd sxdVar = new sxd();
                        sxdVar.a = arrayList2;
                        gy8VarA.close();
                        return sxdVar;
                    case 5:
                        qkf qkfVarB = ((dq1) this.c).b(gy8VarA);
                        gy8VarA.close();
                        return qkfVarB;
                    case 6:
                        int iX02 = gy8VarA.x0();
                        HashMap map2 = new HashMap();
                        while (i2 < iX02) {
                            map2.put(o9gVar.C(gy8VarA.v0()), Float.valueOf(gy8VarA.v0() / 100.0f));
                            i2++;
                        }
                        co9 co9Var = new co9(map2);
                        gy8VarA.close();
                        return co9Var;
                    case 7:
                    default:
                        gy8VarA.close();
                        return null;
                    case 8:
                        trf trfVarP = ((b9b) this.b).p(gy8VarA);
                        gy8VarA.close();
                        return trfVarP;
                }
            } finally {
            }
        } catch (Throwable th) {
            throw new RtcNotificationSerializeException(new IllegalArgumentException("Unable to decode notification body: ".concat(xj6.a(bArr)), th));
        }
    }

    public SpannableStringBuilder c(String str, CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (charSequence != null && str != null) {
            je7 je7Var = (je7) this.c;
            for (a0d a0dVar : ((b0d) je7Var.getValue()).d(charSequence.toString(), ((b0d) je7Var.getValue()).e(charSequence.toString(), str))) {
                spannableStringBuilder.setSpan(new mse(qp4.u0.b((Context) this.a).i(), new w8c(17)), a0dVar.a, a0dVar.b, 17);
            }
        }
        return spannableStringBuilder;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList d(java.util.List r21) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjg.d(java.util.List):java.util.ArrayList");
    }

    @Override // defpackage.e1d
    public void e(sue sueVar, oa5 oa5Var, l3f l3fVar) {
        this.b = sueVar;
        l3fVar.a();
        l3fVar.b();
        xze xzeVarB = oa5Var.B(l3fVar.e, 5);
        this.c = xzeVarB;
        xzeVarB.d((oy5) this.a);
    }

    @Override // defpackage.e1d
    public void f(yaf yafVar) {
        long jC;
        long j;
        np8.g((sue) this.b);
        int i = maf.a;
        sue sueVar = (sue) this.b;
        synchronized (sueVar) {
            try {
                long j2 = sueVar.c;
                jC = j2 != -9223372036854775807L ? j2 + sueVar.b : sueVar.c();
            } finally {
            }
        }
        sue sueVar2 = (sue) this.b;
        synchronized (sueVar2) {
            j = sueVar2.b;
        }
        if (jC == -9223372036854775807L || j == -9223372036854775807L) {
            return;
        }
        oy5 oy5Var = (oy5) this.a;
        if (j != oy5Var.A0) {
            my5 my5VarA = oy5Var.a();
            my5VarA.o = j;
            oy5 oy5Var2 = new oy5(my5VarA);
            this.a = oy5Var2;
            ((xze) this.c).d(oy5Var2);
        }
        int iC = yafVar.c();
        ((xze) this.c).c(iC, yafVar);
        ((xze) this.c).b(jC, 1, iC, 0, null);
    }

    @Override // defpackage.bha
    public void g() {
        ala alaVar;
        if (((eha) this.a).w0 && (alaVar = (ala) this.b) != null) {
            alaVar.a();
        }
        bha bhaVar = ((xka) ((yka) this.c)).a;
        if (bhaVar != null) {
            bhaVar.g();
        }
    }

    @Override // defpackage.tge
    public int h() {
        return rh4.q(12, fk4.d().getDisplayMetrics().density, ((uge) this.b).getMeasuredHeight() - ((r57) this.c).getMeasuredHeight());
    }

    @Override // defpackage.tge
    public int k() {
        return ((r57) this.c).getTop();
    }

    @Override // defpackage.l3a
    public void l(Task task) {
        goc gocVar = (goc) this.a;
        String str = (String) this.b;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.c;
        synchronized (gocVar.a) {
            gocVar.a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override // defpackage.tge
    public void m() {
        drf drfVar = (drf) ((VpnPanelWidget) this.a).b.getValue();
        drfVar.b.o(u9f.c);
    }

    @Override // defpackage.bha
    public void n() {
        ala alaVar;
        if (((eha) this.a).w0 && (alaVar = (ala) this.b) != null) {
            alaVar.a();
        }
        bha bhaVar = ((xka) ((yka) this.c)).a;
        if (bhaVar != null) {
            bhaVar.n();
        }
    }

    @Override // defpackage.tge
    public void onDismiss() {
        drf drfVar = (drf) ((VpnPanelWidget) this.a).b.getValue();
        drfVar.b.o(u9f.c);
    }

    @Override // defpackage.bha
    public void p() {
        bha bhaVar = ((xka) ((yka) this.c)).a;
        if (bhaVar != null) {
            bhaVar.p();
        }
    }

    @Override // defpackage.tge
    public View q() {
        return (r57) this.c;
    }

    @Override // defpackage.tge
    public int y() {
        return ((uge) this.b).getMeasuredHeight();
    }

    public cjg(amf amfVar) {
        this.a = amfVar;
        this.c = new AccelerateDecelerateInterpolator();
    }

    public cjg(String str) {
        my5 my5Var = new my5();
        my5Var.k = str;
        this.a = new oy5(my5Var);
    }
}
