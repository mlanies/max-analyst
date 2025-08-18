package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class x8c extends LinearLayout implements kre {
    public final s5a a;
    public final TextView b;

    public x8c(Context context) {
        super(context, null);
        s5a s5aVar = new s5a(context);
        s5aVar.setId(View.generateViewId());
        float f = 64;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        layoutParams.gravity = 17;
        layoutParams.setMargins(0, 0, 0, tu0.G(8 * fk4.d().getDisplayMetrics().density));
        s5aVar.setLayoutParams(layoutParams);
        s5aVar.setAvatarShape(j5a.a);
        this.a = s5aVar;
        TextView textView = new TextView(context);
        textView.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        setHorizontalGravity(17);
        textView.setLayoutParams(layoutParams2);
        float f2 = 82;
        textView.setMaxWidth(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        i4f.t.b(textView, du4.b);
        textView.setTextColor(qp4.u0.j(textView).getText().e);
        this.b = textView;
        setOrientation(1);
        setLayoutParams(new ViewGroup.LayoutParams(tu0.G(f2 * fk4.d().getDisplayMetrics().density), -2));
        addView(s5aVar);
        addView(textView);
    }

    public final s5a getAvatar() {
        return this.a;
    }

    public final TextView getName() {
        return this.b;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (qqe.c(this.b)) {
            setVerified(true);
        }
        super.onMeasure(i, i2);
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        this.b.setTextColor(fkaVar.getText().e);
    }

    public final void setAbbreviation(uc0 uc0Var) {
        this.a.g(uc0Var, true);
    }

    public final void setAvatar(String str) {
        this.a.setAvatarUrl(str);
    }

    public final void setAvatarShape(m5a m5aVar) {
        this.a.setAvatarShape(m5aVar);
    }

    public final void setName(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public final void setOnline(boolean z) {
        this.a.setOnlineBadgeVisibility(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setVerified(boolean r5) {
        /*
            r4 = this;
            android.widget.TextView r0 = r4.b
            float r1 = defpackage.qqe.e(r0)
            int r1 = defpackage.i24.I(r1)
            r2 = 0
            if (r5 == 0) goto L1a
            ecf r3 = defpackage.qqe.a(r0)
            if (r3 == 0) goto L16
            int r3 = r3.a
            goto L17
        L16:
            r3 = r2
        L17:
            if (r3 != r1) goto L1a
            return
        L1a:
            if (r5 == 0) goto L36
            ecf r5 = defpackage.qqe.a(r0)
            if (r5 == 0) goto L24
            int r2 = r5.a
        L24:
            if (r2 == r1) goto L36
            ecf r5 = new ecf
            android.content.Context r4 = r4.getContext()
            w8c r2 = new w8c
            r3 = 0
            r2.<init>(r3)
            r5.<init>(r4, r1, r2)
            goto L37
        L36:
            r5 = 0
        L37:
            defpackage.qqe.d(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x8c.setVerified(boolean):void");
    }
}
