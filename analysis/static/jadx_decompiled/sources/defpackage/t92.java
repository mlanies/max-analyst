package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class t92 extends ni0 {
    public final s5a a;
    public final TextView b;
    public final TextView c;
    public final s92 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t92(Context context) {
        super(context, null, 0);
        Continuation continuation = null;
        s5a s5aVar = new s5a(context);
        float f = 71;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        layoutParams.gravity = 1;
        layoutParams.bottomMargin = tu0.G(12 * fk4.d().getDisplayMetrics().density);
        s5aVar.setLayoutParams(layoutParams);
        this.a = s5aVar;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.bottomMargin = tu0.G(8 * fk4.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams2);
        textView.setTextAlignment(4);
        textView.setSingleLine(true);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        i4f.k.b(textView, du4.b);
        int i = 3;
        v3c.y(new v9(i, continuation, 3), textView);
        this.b = textView;
        TextView textView2 = new TextView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        textView2.setLayoutParams(layoutParams3);
        textView2.setGravity(17);
        i4f.s.b(textView2, du4.b);
        v3c.y(new v9(i, continuation, 2), textView2);
        this.c = textView2;
        s92 s92Var = new s92(context);
        s92Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.o = s92Var;
        addView(s5aVar);
        addView(textView);
        addView(textView2);
        addView(s92Var);
        setGravity(1);
        setMinimumWidth(tu0.G(296 * fk4.d().getDisplayMetrics().density));
        float f2 = 24;
        setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(20 * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
    }

    @Override // defpackage.ni0, defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        super.onThemeChanged(fkaVar);
        qp4.d(qp4.u0.b(getContext()), this);
    }

    public final void setDescriptions(List<? extends jqe> list) {
        s92 s92Var = this.o;
        s92Var.getClass();
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((jqe) it.next()).d(s92Var));
        }
        s92Var.t0 = arrayList;
        s92Var.requestLayout();
        s92Var.invalidate();
        this.c.setGravity(list.isEmpty() ? 17 : 8388611);
    }

    public final void setSubtitle(jqe jqeVar) {
        TextView textView = this.c;
        textView.setText(jqeVar.d(this));
        CharSequence text = textView.getText();
        textView.setVisibility((text == null || text.length() == 0) ^ true ? 0 : 8);
    }

    public final void setTitle(jqe jqeVar) {
        TextView textView = this.b;
        textView.setText(jqeVar.b(textView.getContext()));
    }
}
