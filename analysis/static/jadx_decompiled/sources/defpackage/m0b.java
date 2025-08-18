package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes2.dex */
public final class m0b extends ConstraintLayout implements kre {
    public static final /* synthetic */ int N0 = 0;
    public final ImageView G0;
    public final TextView H0;
    public final TextView I0;
    public final jg3 J0;
    public final TextView K0;
    public final TextView L0;
    public k56 M0;

    public m0b(Context context) {
        super(context);
        this.M0 = new s4a(23);
        cla claVar = new cla(context, 6);
        claVar.setId(kxb.oneme_settings_privacy_pin_code_toolbar);
        claVar.setBackgroundColor(0);
        claVar.setForm(uka.a);
        claVar.setLeftActions(new kka(new wz7(20, this)));
        claVar.setLayoutParams(new ti3(-1, -2));
        addView(claVar);
        ImageView imageView = new ImageView(context);
        imageView.setId(kxb.oneme_settings_privacy_setup_pin_code_lock);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        pq9 pq9Var = qp4.u0;
        shapeDrawable.setTint(pq9Var.j(imageView).b().l);
        imageView.setBackground(shapeDrawable);
        float f = 16;
        rh4.p(f, fk4.d().getDisplayMetrics().density, imageView);
        imageView.setImageResource(gpc.s0);
        imageView.setImageTintList(ColorStateList.valueOf(pq9Var.j(imageView).getIcon().j));
        float f2 = 64;
        imageView.setLayoutParams(new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
        addView(imageView);
        this.G0 = imageView;
        TextView textView = new TextView(context);
        textView.setId(kxb.oneme_settings_privacy_setup_pin_code_title);
        kqe kqeVar = i4f.j;
        kqeVar.b(textView, du4.b);
        textView.setTextColor(pq9Var.j(textView).getText().e);
        textView.setSingleLine(true);
        textView.setLayoutParams(new ti3(-2, -2));
        addView(textView);
        this.H0 = textView;
        TextView textView2 = new TextView(context);
        textView2.setId(kxb.oneme_settings_privacy_setup_pin_code_description);
        textView2.setVisibility(8);
        i4f.m.b(textView2, du4.b);
        textView2.setTextColor(pq9Var.j(textView2).getText().g);
        ti3 ti3Var = new ti3(-2, -2);
        textView2.setGravity(1);
        textView2.setLayoutParams(ti3Var);
        addView(textView2);
        this.I0 = textView2;
        jg3 jg3Var = new jg3(context, null);
        jg3Var.setId(kxb.oneme_settings_privacy_setup_pin_code_input);
        jg3Var.setKeyboardOpen(new s4a(24));
        jg3Var.setCountCells(4);
        jg3Var.setLayoutParams(new ti3(-2, -2));
        jg3Var.setSecure(true);
        jg3Var.setDisableInputsForError(false);
        pla.a(jg3Var, new bf3(jg3Var, jg3Var, 1));
        jg3Var.setKeyboardOpen(new lwa(2, jg3Var));
        addView(jg3Var);
        this.J0 = jg3Var;
        TextView textView3 = new TextView(context);
        textView3.setId(kxb.oneme_settings_privacy_setup_pin_code_error);
        textView3.setVisibility(8);
        textView3.setTextAlignment(4);
        i4f.p.b(textView3, du4.b);
        textView3.setSingleLine(true);
        textView3.setLayoutParams(new ti3(-2, -2));
        addView(textView3);
        this.K0 = textView3;
        TextView textView4 = new TextView(context);
        textView4.setId(kxb.oneme_settings_privacy_setup_pin_code_forgot);
        textView4.setVisibility(8);
        textView4.setText(p1c.oneme_settings_privacy_forgot_pin_code);
        textView4.isSingleLine();
        kqeVar.b(textView4, du4.b);
        textView4.setTextAlignment(4);
        textView4.setLayoutParams(new ti3(-2, -2));
        addView(textView4);
        this.L0 = textView4;
        onThemeChanged(pq9Var.j(this));
        dj3 dj3VarQ = fp3.q(this);
        int id = claVar.getId();
        dj3VarQ.d(id, 3, 0, 3);
        dj3VarQ.d(id, 6, 0, 6);
        dj3VarQ.d(id, 7, 0, 7);
        int id2 = imageView.getId();
        dj3VarQ.d(id2, 3, claVar.getId(), 4);
        float f3 = 24;
        au1.p(f3, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id2, 4));
        dj3VarQ.d(id2, 6, 0, 6);
        dj3VarQ.d(id2, 7, 0, 7);
        int id3 = textView.getId();
        dj3VarQ.d(id3, 3, imageView.getId(), 4);
        au1.p(f3, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id3, 4));
        dj3VarQ.d(id3, 6, 0, 6);
        float f4 = 12;
        au1.p(f4, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 6, id3, 4));
        dj3VarQ.d(id3, 7, 0, 7);
        new l2a(dj3VarQ, 7, id3, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f4));
        int id4 = textView2.getId();
        dj3VarQ.d(id4, 3, textView.getId(), 4);
        au1.p(f4, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id4, 4));
        dj3VarQ.d(id4, 6, 0, 6);
        au1.p(f4, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 6, id4, 4));
        dj3VarQ.d(id4, 7, 0, 7);
        new l2a(dj3VarQ, 7, id4, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f4));
        int id5 = jg3Var.getId();
        dj3VarQ.d(id5, 3, textView.getId(), 4);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id5, 4));
        dj3VarQ.d(id5, 6, 0, 6);
        au1.p(f4, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 6, id5, 4));
        dj3VarQ.d(id5, 7, 0, 7);
        new l2a(dj3VarQ, 7, id5, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f4));
        int id6 = textView3.getId();
        dj3VarQ.d(id6, 3, jg3Var.getId(), 4);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id6, 4));
        dj3VarQ.d(id6, 6, 0, 6);
        au1.p(f4, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 6, id6, 4));
        dj3VarQ.d(id6, 7, 0, 7);
        new l2a(dj3VarQ, 7, id6, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f4));
        int id7 = textView4.getId();
        dj3VarQ.d(id7, 6, 0, 6);
        au1.p(f4, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 6, id7, 4));
        dj3VarQ.d(id7, 7, 0, 7);
        au1.p(f4, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 7, id7, 4));
        dj3VarQ.d(id7, 4, 0, 4);
        new l2a(dj3VarQ, 4, id7, 4).e(tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        dj3VarQ.a(this);
    }

    public final k56 getOnBackPress() {
        return this.M0;
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        setBackgroundColor(fkaVar.b().k);
        ImageView imageView = this.G0;
        imageView.getBackground().setTint(fkaVar.b().l);
        imageView.setImageTintList(ColorStateList.valueOf(fkaVar.getIcon().j));
        this.H0.setTextColor(fkaVar.getText().e);
        this.I0.setTextColor(fkaVar.getText().g);
        this.J0.onThemeChanged(fkaVar);
        this.K0.setTextColor(fkaVar.getText().b);
        this.L0.setTextColor(fkaVar.getText().j);
    }

    public final void setDescription(Integer num) {
        TextView textView = this.I0;
        if (num != null) {
            textView.setText(num.intValue());
            textView.setVisibility(0);
        } else {
            textView.setText((CharSequence) null);
            textView.setVisibility(8);
        }
        int id = textView.getVisibility() == 0 ? textView.getId() : this.H0.getId();
        dj3 dj3VarQ = fp3.q(this);
        new sh0(this.J0.getId(), 4, dj3VarQ).E(id).e(tu0.G(16 * fk4.d().getDisplayMetrics().density));
        dj3VarQ.a(this);
    }

    public final void setErrorText(CharSequence charSequence) {
        TextView textView = this.K0;
        textView.setText(charSequence);
        boolean z = !(charSequence == null || charSequence.length() == 0);
        float f = z ? 1.0f : 0.0f;
        textView.setAlpha(z ? 0.0f : 1.0f);
        textView.animate().setDuration(200L).alpha(f).withEndAction(new u60(this, z, 11)).start();
    }

    public final void setForgotPinCodeClickListener(k56 k56Var) {
        TextView textView = this.L0;
        if (k56Var != null) {
            textView.setVisibility(0);
            tu0.K(textView, 300L, new m6(18, k56Var));
        } else {
            textView.setVisibility(8);
            textView.setOnClickListener(null);
        }
    }

    public final void setListener(fg3 fg3Var) {
        this.J0.setListener(fg3Var);
    }

    public final void setLocked(boolean z) {
        this.G0.setImageResource(z ? gpc.Y : gpc.s0);
    }

    public final void setOnBackPress(k56 k56Var) {
        this.M0 = k56Var;
    }

    public final void setState(gg3 gg3Var) {
        this.J0.setState(gg3Var);
    }

    public final void setTitle(int i) {
        this.H0.setText(i);
    }
}
