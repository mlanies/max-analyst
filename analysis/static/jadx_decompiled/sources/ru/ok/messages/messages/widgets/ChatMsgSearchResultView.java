package ru.ok.messages.messages.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.c5;
import defpackage.du4;
import defpackage.fka;
import defpackage.i4f;
import defpackage.kqe;
import defpackage.kre;
import defpackage.ngg;
import defpackage.pq9;
import defpackage.qp4;
import defpackage.tu0;
import defpackage.xxb;
import defpackage.yyb;

/* loaded from: classes2.dex */
public class ChatMsgSearchResultView extends ConstraintLayout implements kre {
    public static final /* synthetic */ int L0 = 0;
    public final TextView G0;
    public final ImageView H0;
    public final ImageView I0;
    public final ProgressBar J0;
    public final View K0;

    public ChatMsgSearchResultView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, yyb.chat_msg_search_result_view, this);
        this.G0 = (TextView) findViewById(xxb.chat_msg_search_result_view__result);
        ImageView imageView = (ImageView) findViewById(xxb.chat_msg_search_result_view__next);
        this.H0 = imageView;
        tu0.K(imageView, 100L, new c5(16, this));
        ImageView imageView2 = (ImageView) findViewById(xxb.chat_msg_search_result_view__prev);
        this.I0 = imageView2;
        tu0.K(imageView2, 100L, new c5(16, this));
        this.J0 = (ProgressBar) findViewById(xxb.chat_msg_search_result_view__pb_loading);
        this.K0 = findViewById(xxb.chat_msg_search_result_view_next_prev_separator);
        c();
    }

    public final void c() {
        pq9 pq9Var = qp4.u0;
        fka fkaVarJ = pq9Var.j(this);
        setBackgroundColor(fkaVarJ.a().h().a.d);
        ImageView imageView = this.H0;
        boolean zIsEnabled = imageView.isEnabled();
        boolean z = !zIsEnabled;
        fka fkaVarJ2 = pq9Var.j(this);
        imageView.setColorFilter(z ? fkaVarJ2.d().b.a.f : fkaVarJ2.getIcon().f);
        imageView.setEnabled(zIsEnabled);
        imageView.setVisibility(0);
        ImageView imageView2 = this.I0;
        boolean zIsEnabled2 = imageView2.isEnabled();
        boolean z2 = !zIsEnabled2;
        fka fkaVarJ3 = pq9Var.j(this);
        imageView2.setColorFilter(z2 ? fkaVarJ3.d().b.a.f : fkaVarJ3.getIcon().f);
        imageView2.setEnabled(zIsEnabled2);
        imageView2.setVisibility(0);
        ngg.H(this.J0, fkaVarJ.f().c);
        kqe kqeVar = i4f.l;
        du4 du4Var = du4.b;
        TextView textView = this.G0;
        kqeVar.b(textView, du4Var);
        textView.setTextColor(fkaVarJ.getText().h);
        this.K0.setBackgroundColor(fkaVarJ.getIcon().h);
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        c();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
