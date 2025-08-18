package one.me.appupdate.forceupdate;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.b7a;
import defpackage.bzb;
import defpackage.c6a;
import defpackage.c7a;
import defpackage.dj3;
import defpackage.du4;
import defpackage.e62;
import defpackage.fk4;
import defpackage.fp3;
import defpackage.i4f;
import defpackage.ix3;
import defpackage.l4a;
import defpackage.m4a;
import defpackage.pp;
import defpackage.pq9;
import defpackage.qp4;
import defpackage.rh4;
import defpackage.s36;
import defpackage.ti3;
import defpackage.tu0;
import defpackage.up;
import defpackage.v3c;
import defpackage.woc;
import defpackage.x27;
import defpackage.xx5;
import defpackage.yq0;
import defpackage.yx5;
import defpackage.z6a;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/appupdate/forceupdate/ForceUpdateScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "app-update_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class ForceUpdateScreen extends Widget {
    public static final /* synthetic */ int o = 0;
    public final x27 a;
    public final up b;
    public final c6a c;

    /* JADX WARN: Multi-variable type inference failed */
    public ForceUpdateScreen() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = new x27(0, new yq0(3, 1, false), 1);
        pp ppVar = pp.a;
        this.b = (up) ppVar.getAccessor().c(up.class);
        this.c = (c6a) ppVar.getAccessor().c(c6a.class);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getB() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ImageView imageView = new ImageView(getContext());
        imageView.setId(l4a.a);
        imageView.setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 32.0f));
        imageView.setBackground(s36.n((Context) this.c.a.c(Context.class), bzb.ic_launcher_background));
        rh4.p(17, fk4.d().getDisplayMetrics().density, imageView);
        imageView.setImageResource(woc.d);
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setId(l4a.e);
        imageView2.setClipToOutline(true);
        imageView2.setOutlineProvider(new e62(imageView2, 4));
        imageView2.setBackground(s36.a(imageView2.getContext(), 1301046487, 78.0f, true));
        float f = 12;
        rh4.p(f, fk4.d().getDisplayMetrics().density, imageView2);
        imageView2.setImageResource(woc.g);
        TextView textView = new TextView(getContext());
        textView.setId(l4a.c);
        textView.setGravity(1);
        i4f.h.b(textView, du4.b);
        pq9 pq9Var = qp4.u0;
        textView.setTextColor(pq9Var.j(textView).getText().e);
        textView.setText(m4a.b);
        TextView textView2 = new TextView(getContext());
        textView2.setId(l4a.b);
        textView2.setGravity(1);
        i4f.H.b(textView2, du4.b);
        textView2.setTextColor(pq9Var.j(textView2).getText().e);
        textView2.setText(m4a.a);
        OneMeButton oneMeButton = new OneMeButton(getContext(), null);
        oneMeButton.setId(l4a.d);
        oneMeButton.setAppearance(z6a.c);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setText(m4a.c);
        tu0.K(oneMeButton, 300L, new xx5(0, this));
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        v3c.y(new yx5(textView, textView2, null, 0), constraintLayout);
        float f2 = 120;
        constraintLayout.addView(imageView, tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        float f3 = 60;
        ti3 ti3Var = new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        float f4 = 84;
        ti3Var.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f4));
        ((ViewGroup.MarginLayoutParams) ti3Var).topMargin = tu0.G(f4 * fk4.d().getDisplayMetrics().density);
        constraintLayout.addView(imageView2, ti3Var);
        ti3 ti3Var2 = new ti3(-1, -2);
        ti3Var2.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
        ti3Var2.setMarginEnd(tu0.G(fk4.d().getDisplayMetrics().density * f));
        ((ViewGroup.MarginLayoutParams) ti3Var2).bottomMargin = tu0.G(20 * fk4.d().getDisplayMetrics().density);
        ((ViewGroup.MarginLayoutParams) ti3Var2).topMargin = tu0.G(50 * fk4.d().getDisplayMetrics().density);
        constraintLayout.addView(textView, ti3Var2);
        ti3 ti3Var3 = new ti3(-1, -2);
        ti3Var3.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
        ti3Var3.setMarginEnd(tu0.G(fk4.d().getDisplayMetrics().density * f));
        constraintLayout.addView(textView2, ti3Var3);
        ti3 ti3Var4 = new ti3(-1, -2);
        ti3Var4.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
        ti3Var4.setMarginEnd(tu0.G(f * fk4.d().getDisplayMetrics().density));
        ((ViewGroup.MarginLayoutParams) ti3Var4).bottomMargin = tu0.G(24 * fk4.d().getDisplayMetrics().density);
        constraintLayout.addView(oneMeButton, ti3Var4);
        dj3 dj3VarQ = fp3.q(constraintLayout);
        int id = imageView.getId();
        dj3VarQ.d(id, 3, 0, 3);
        dj3VarQ.d(id, 6, 0, 6);
        dj3VarQ.d(id, 7, 0, 7);
        dj3VarQ.d(id, 4, textView.getId(), 3);
        dj3VarQ.g(id).d.W = 2;
        int id2 = imageView2.getId();
        dj3VarQ.d(id2, 3, imageView.getId(), 3);
        dj3VarQ.d(id2, 4, imageView.getId(), 4);
        dj3VarQ.d(id2, 6, imageView.getId(), 6);
        dj3VarQ.d(id2, 7, imageView.getId(), 7);
        int id3 = textView.getId();
        dj3VarQ.d(id3, 3, imageView.getId(), 4);
        dj3VarQ.d(id3, 6, 0, 6);
        dj3VarQ.d(id3, 7, 0, 7);
        dj3VarQ.d(id3, 4, textView2.getId(), 3);
        int id4 = textView2.getId();
        dj3VarQ.d(id4, 3, textView.getId(), 4);
        dj3VarQ.d(id4, 6, 0, 6);
        dj3VarQ.d(id4, 7, 0, 7);
        dj3VarQ.d(id4, 4, oneMeButton.getId(), 3);
        int id5 = oneMeButton.getId();
        dj3VarQ.d(id5, 4, 0, 4);
        dj3VarQ.d(id5, 6, 0, 6);
        dj3VarQ.d(id5, 7, 0, 7);
        dj3VarQ.a(constraintLayout);
        return constraintLayout;
    }
}
