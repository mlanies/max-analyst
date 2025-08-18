package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public abstract class v08 {
    public final TimeInterpolator a;
    public final View b;
    public final int c;
    public final int d;
    public final int e;
    public ge0 f;

    public v08(View view) {
        this.b = view;
        Context context = view.getContext();
        this.a = z7.Q(context, tsb.motionEasingStandardDecelerateInterpolator, rra.b(0.0f, 0.0f, 0.0f, 1.0f));
        this.c = z7.P(tsb.motionDurationMedium2, HttpStatus.SC_MULTIPLE_CHOICES, context);
        this.d = z7.P(tsb.motionDurationShort3, 150, context);
        this.e = z7.P(tsb.motionDurationShort2, 100, context);
    }
}
