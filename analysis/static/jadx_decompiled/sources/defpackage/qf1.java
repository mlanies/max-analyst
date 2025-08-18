package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;

/* loaded from: classes.dex */
public final /* synthetic */ class qf1 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallOpponentsListWidget b;

    public /* synthetic */ qf1(CallOpponentsListWidget callOpponentsListWidget, int i) {
        this.a = i;
        this.b = callOpponentsListWidget;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        e5f e5fVar = e5f.a;
        CallOpponentsListWidget callOpponentsListWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = CallOpponentsListWidget.H0;
                callOpponentsListWidget.getRouter().B(callOpponentsListWidget);
                break;
            case 1:
                bc7[] bc7VarArr2 = CallOpponentsListWidget.H0;
                of1 of1VarR0 = callOpponentsListWidget.r0();
                of1VarR0.getClass();
                je1.c.getClass();
                pnf.o(of1VarR0.E0, new c64(":call-admin-settings"));
                break;
            case 2:
                fm fmVar = (fm) obj;
                bc7[] bc7VarArr3 = CallOpponentsListWidget.H0;
                w53 w53Var = new w53(fmVar.getContext());
                dm dmVar = new dm(-1, -2);
                dmVar.a = 19;
                w53Var.setLayoutParams(dmVar);
                w53Var.setTitleEnabled(false);
                Toolbar toolbar = new Toolbar(w53Var.getContext(), null);
                t53 t53Var = new t53(-1, -2);
                t53Var.a = 1;
                toolbar.setLayoutParams(t53Var);
                toolbar.setNavigationIcon((Drawable) null);
                toolbar.u(0, 0);
                toolbar.addView(callOpponentsListWidget.q0());
                w53Var.addView(toolbar);
                qf1 qf1Var = new qf1(callOpponentsListWidget, 3);
                View viewN0 = callOpponentsListWidget.n0();
                qf1Var.invoke(viewN0);
                w53Var.addView(viewN0);
                fmVar.addView(w53Var);
                fmVar.addView(callOpponentsListWidget.p0());
                break;
            default:
                LinearLayout linearLayout = (LinearLayout) obj;
                bc7[] bc7VarArr4 = CallOpponentsListWidget.H0;
                callOpponentsListWidget.getClass();
                bc7[] bc7VarArr5 = CallOpponentsListWidget.H0;
                bc7 bc7Var = bc7VarArr5[4];
                linearLayout.addView((TextView) callOpponentsListWidget.w0.getValue());
                bc7 bc7Var2 = bc7VarArr5[5];
                linearLayout.addView((TextView) callOpponentsListWidget.x0.getValue());
                bc7 bc7Var3 = bc7VarArr5[2];
                linearLayout.addView((o7a) callOpponentsListWidget.u0.getValue());
                TextView textView = new TextView(linearLayout.getContext());
                textView.setId(y7a.T0);
                i4f.u.b(textView, du4.b);
                textView.setTextColor(qp4.u0.p(textView).c.getText().g);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setText(b8a.A);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                float f = 12;
                layoutParams.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
                layoutParams.setMarginEnd(tu0.G(f * fk4.d().getDisplayMetrics().density));
                layoutParams.topMargin = tu0.G(16 * fk4.d().getDisplayMetrics().density);
                layoutParams.bottomMargin = tu0.G(8 * fk4.d().getDisplayMetrics().density);
                textView.setLayoutParams(layoutParams);
                textView.setVisibility(8);
                linearLayout.addView(textView);
                RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), null);
                recyclerView.setId(y7a.Q0);
                recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setAdapter((ja) callOpponentsListWidget.E0.getValue());
                recyclerView.setItemAnimator(null);
                linearLayout.addView(recyclerView);
                bc7 bc7Var4 = bc7VarArr5[6];
                linearLayout.addView((TextView) callOpponentsListWidget.y0.getValue());
                break;
        }
        return e5fVar;
    }
}
