package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.ImageView;
import ru.ok.messages.views.widgets.EllipsizingEndTextView;
import ru.ok.messages.views.widgets.ImageSpanEllipsizedTextView;

/* loaded from: classes2.dex */
public final class jn7 extends dec implements nse {
    public final ImageView F0;
    public final ImageSpanEllipsizedTextView G0;
    public final EllipsizingEndTextView H0;

    public jn7(kn7 kn7Var, View view) {
        super(view);
        ImageView imageView = (ImageView) view.findViewById(xxb.row_chat_location__stop);
        this.F0 = imageView;
        ImageSpanEllipsizedTextView imageSpanEllipsizedTextView = (ImageSpanEllipsizedTextView) view.findViewById(xxb.row_chat_location__tv_title);
        this.G0 = imageSpanEllipsizedTextView;
        new vqe(imageSpanEllipsizedTextView, c54.a(imageSpanEllipsizedTextView.getContext())).a();
        this.H0 = (EllipsizingEndTextView) view.findViewById(xxb.row_chat_location__tv_subtitle);
        nd7.h(view, new e5(10, this));
        nd7.h(imageView, new e5(10, this));
        c();
    }

    @Override // defpackage.nse
    public final void c() {
        View view = this.a;
        Context context = view.getContext();
        khe kheVar = sme.a0;
        sme smeVarR = fm9.R(context);
        view.setBackground(hm9.L(0, smeVarR.i));
        RippleDrawable rippleDrawableA = smeVarR.a();
        ImageView imageView = this.F0;
        imageView.setBackground(rippleDrawableA);
        imageView.setColorFilter(smeVarR.M, PorterDuff.Mode.SRC_IN);
        this.G0.setTextColor(smeVarR.F);
        this.H0.setTextColor(smeVarR.J);
    }
}
