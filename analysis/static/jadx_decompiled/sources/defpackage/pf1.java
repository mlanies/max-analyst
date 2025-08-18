package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class pf1 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallOpponentsListWidget b;

    public /* synthetic */ pf1(CallOpponentsListWidget callOpponentsListWidget, int i) {
        this.a = i;
        this.b = callOpponentsListWidget;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        int i = 1;
        int i2 = 0;
        pq9 pq9Var = qp4.u0;
        CallOpponentsListWidget callOpponentsListWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = CallOpponentsListWidget.H0;
                fm fmVar = new fm(callOpponentsListWidget.getContext());
                fmVar.setFocusable(true);
                fmVar.setFocusableInTouchMode(true);
                fmVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                fmVar.setBackground(null);
                fmVar.setStateListAnimator(null);
                return fmVar;
            case 1:
                bc7[] bc7VarArr2 = CallOpponentsListWidget.H0;
                return tpa.u(callOpponentsListWidget.getContext());
            case 2:
                bc7[] bc7VarArr3 = CallOpponentsListWidget.H0;
                Drawable drawableB = kt3.b(callOpponentsListWidget.getContext(), ztb.ic_clear_16);
                drawableB.setTint(pq9Var.o(callOpponentsListWidget.getContext()).c.getText().g);
                return drawableB;
            case 3:
                bc7[] bc7VarArr4 = CallOpponentsListWidget.H0;
                je7 je7VarC = yi1.c();
                je7 je7Var = iyc.a;
                n31 n31Var = n31.a;
                oqa oqaVar = (oqa) n31Var.getAccessor().c(oqa.class);
                kke kkeVarS = jyc.a.s();
                zi1 zi1Var = zi1.a;
                ir1 ir1VarB = zi1Var.b();
                je7 je7VarB = yi1.b();
                je7 je7VarA = yi1.a();
                je7 je7VarD = yi1.d();
                khe kheVarD = zi1Var.getAccessor().d(kr1.class);
                qx7 qx7Var = new qx7(6);
                b31 b31VarB = n31Var.b();
                khe kheVarD2 = zi1Var.getAccessor().d(q33.class);
                ir1 ir1VarB2 = zi1Var.b();
                je7 je7VarA2 = yi1.a();
                return new of1(je7VarC, kheVarD, je7VarB, je7VarA, je7VarD, kheVarD2, b31VarB, new eo1(new pf1(callOpponentsListWidget, 9), ir1VarB2, iyc.l, yi1.c(), iyc.b, je7VarA2, iyc.a()), oqaVar, kkeVarS, ir1VarB, qx7Var);
            case 4:
                bc7[] bc7VarArr5 = CallOpponentsListWidget.H0;
                LinearLayout linearLayout = new LinearLayout(callOpponentsListWidget.getContext());
                t53 t53Var = new t53(-1, -2);
                t53Var.a = 2;
                linearLayout.setLayoutParams(t53Var);
                linearLayout.setOrientation(1);
                return linearLayout;
            case 5:
                bc7[] bc7VarArr6 = CallOpponentsListWidget.H0;
                return new pka(null, new wka(x7a.C, 0, new qf1(callOpponentsListWidget, i), 14));
            case 6:
                bc7[] bc7VarArr7 = CallOpponentsListWidget.H0;
                cla claVar = new cla(callOpponentsListWidget.getContext(), 6);
                claVar.setForm(uka.a);
                claVar.setTextShimmerEnabled(false);
                claVar.setLeftActions(new kka(new qf1(callOpponentsListWidget, i2)));
                float f = 6;
                claVar.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f), claVar.getPaddingTop(), tu0.G(f * fk4.d().getDisplayMetrics().density), claVar.getPaddingBottom());
                claVar.setCustomTheme(pq9Var.p(claVar).c);
                return claVar;
            case 7:
                bc7[] bc7VarArr8 = CallOpponentsListWidget.H0;
                o7a o7aVar = new o7a(callOpponentsListWidget.getContext());
                o7aVar.setId(y7a.o0);
                rw3 rw3Var = new rw3(-1, -2);
                float f2 = 12;
                rw3Var.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f2));
                rw3Var.setMarginEnd(tu0.G(f2 * fk4.d().getDisplayMetrics().density));
                o7aVar.setLayoutParams(rw3Var);
                o7aVar.setCustomTheme(pq9Var.p(o7aVar).c);
                o7aVar.setAppearance(g7a.b);
                o7aVar.setListener(new ync(17, callOpponentsListWidget));
                return o7aVar;
            case 8:
                bc7[] bc7VarArr9 = CallOpponentsListWidget.H0;
                RecyclerView recyclerView = new RecyclerView(callOpponentsListWidget.getContext(), null);
                recyclerView.setId(rvb.call_user_list_in_call_list);
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setAdapter((cf1) callOpponentsListWidget.D0.getValue());
                recyclerView.setClipToPadding(true);
                recyclerView.setBackgroundColor(pq9Var.p(recyclerView).c.b().k);
                rw3 rw3Var2 = new rw3(-1, -1);
                rw3Var2.b(new AppBarLayout$ScrollingViewBehavior());
                recyclerView.setLayoutParams(rw3Var2);
                return recyclerView;
            case 9:
                bc7[] bc7VarArr10 = CallOpponentsListWidget.H0;
                return callOpponentsListWidget.getViewLifecycleScope();
            case 10:
                bc7[] bc7VarArr11 = CallOpponentsListWidget.H0;
                TextView textView = new TextView(callOpponentsListWidget.getContext());
                i4f.B.b(textView, du4.b);
                textView.setTextColor(pq9Var.p(textView).c.getText().e);
                textView.setMaxLines(3);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(17);
                float f3 = 20;
                textView.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(12 * fk4.d().getDisplayMetrics().density), tu0.G(f3 * fk4.d().getDisplayMetrics().density), tu0.G(4 * fk4.d().getDisplayMetrics().density));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                float f4 = 28;
                layoutParams.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f4));
                layoutParams.setMarginEnd(tu0.G(f4 * fk4.d().getDisplayMetrics().density));
                textView.setLayoutParams(layoutParams);
                return textView;
            case 11:
                bc7[] bc7VarArr12 = CallOpponentsListWidget.H0;
                TextView textView2 = new TextView(callOpponentsListWidget.getContext());
                i4f.p.b(textView2, du4.b);
                textView2.setTextColor(pq9Var.p(textView2).c.getText().g);
                textView2.setMaxLines(1);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setGravity(17);
                float f5 = 12;
                textView2.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f5), tu0.G(4 * fk4.d().getDisplayMetrics().density), tu0.G(f5 * fk4.d().getDisplayMetrics().density), tu0.G(18 * fk4.d().getDisplayMetrics().density));
                textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                return textView2;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                bc7[] bc7VarArr13 = CallOpponentsListWidget.H0;
                TextView textView3 = new TextView(callOpponentsListWidget.getContext());
                i4f.u.b(textView3, du4.b);
                textView3.setTextColor(pq9Var.p(textView3).c.getText().g);
                textView3.setMaxLines(1);
                textView3.setEllipsize(TextUtils.TruncateAt.END);
                textView3.setText(b8a.p1);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
                float f6 = 12;
                layoutParams2.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f6));
                layoutParams2.setMarginEnd(tu0.G(f6 * fk4.d().getDisplayMetrics().density));
                layoutParams2.topMargin = tu0.G(16 * fk4.d().getDisplayMetrics().density);
                layoutParams2.bottomMargin = tu0.G(8 * fk4.d().getDisplayMetrics().density);
                textView3.setLayoutParams(layoutParams2);
                return textView3;
            case 13:
                bc7[] bc7VarArr14 = CallOpponentsListWidget.H0;
                EditText editText = new EditText(callOpponentsListWidget.getContext());
                editText.setId(rvb.call_user_list_in_call_bottom_search);
                i4f.a.b(editText, du4.b);
                editText.setHintTextColor(pq9Var.p(editText).c.getText().g);
                editText.setTextColor(pq9Var.p(editText).c.getText().e);
                float f7 = 12;
                int iG = tu0.G(fk4.d().getDisplayMetrics().density * f7);
                editText.setPadding(iG, iG, iG, iG);
                editText.setMaxLines(1);
                editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(250)});
                t53 t53Var2 = new t53(-1, -2);
                t53Var2.a = 1;
                ((FrameLayout.LayoutParams) t53Var2).bottomMargin = tu0.G(4 * fk4.d().getDisplayMetrics().density);
                t53Var2.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f7));
                t53Var2.setMarginEnd(tu0.G(f7 * fk4.d().getDisplayMetrics().density));
                editText.setLayoutParams(t53Var2);
                bn1 bn1Var = (bn1) callOpponentsListWidget.b.getValue();
                int i3 = b8a.f2;
                bn1Var.getClass();
                Context context = bn1Var.a;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(wg0.i("  ", context.getString(i3)));
                Drawable drawableE = dy7.E(ztb.ic_search_outline_16, pq9Var.o(context).c.getIcon().j, context);
                float f8 = 16;
                drawableE.setBounds(0, 0, tu0.G(fk4.d().getDisplayMetrics().density * f8), tu0.G(f8 * fk4.d().getDisplayMetrics().density));
                spannableStringBuilder.setSpan(new yl5(drawableE, (sl5) null, 6), 0, 1, 17);
                editText.setHint(spannableStringBuilder);
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape((float[]) callOpponentsListWidget.a.getValue(), null, null));
                shapeDrawable.getPaint().setColor(pq9Var.p(editText).c.b().a.g);
                editText.setBackground(shapeDrawable);
                editText.addTextChangedListener(new vf1(editText, i2, callOpponentsListWidget));
                editText.setOnTouchListener(new rf1(new we1(3), i2, editText));
                return editText;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                bc7[] bc7VarArr15 = CallOpponentsListWidget.H0;
                ViewStub viewStub = new ViewStub(callOpponentsListWidget.getContext());
                viewStub.setId(rvb.call_screen_opponent_empty_list);
                return viewStub;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                bc7[] bc7VarArr16 = CallOpponentsListWidget.H0;
                aba abaVar = new aba(callOpponentsListWidget.getContext(), null);
                abaVar.setId(rvb.call_screen_opponent_empty_list);
                rw3 rw3Var3 = new rw3(-1, -1);
                rw3Var3.b(new AppBarLayout$ScrollingViewBehavior());
                abaVar.setLayoutParams(rw3Var3);
                abaVar.setPadding(0, 0, 0, rh4.c(40, fk4.d().getDisplayMetrics().density, ((ivc) callOpponentsListWidget.c.getValue()).d));
                abaVar.setIcon(x7a.n0);
                abaVar.setTitle(new eqe(b8a.n1));
                abaVar.setSubtitle(new eqe(b8a.m1));
                abaVar.setVisibility(8);
                abaVar.setCustomTheme(pq9Var.p(abaVar).c);
                return abaVar;
            case 16:
                bc7[] bc7VarArr17 = CallOpponentsListWidget.H0;
                return new cf1(new ey1(6, callOpponentsListWidget));
            default:
                bc7[] bc7VarArr18 = CallOpponentsListWidget.H0;
                return new ja(new sy4(6, callOpponentsListWidget), ((iba) zi1.a.getAccessor().c(iba.class)).a(), new lrf(callOpponentsListWidget.getContext()));
        }
    }
}
