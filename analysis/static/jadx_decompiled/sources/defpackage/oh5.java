package defpackage;

import android.content.Context;
import android.graphics.drawable.DrawableWrapper;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* loaded from: classes2.dex */
public final class oh5 extends DrawableWrapper {
    public final je7 a;
    public final je7 b;
    public final je7 c;

    public oh5(Context context) {
        super(new EnhancedVectorDrawable(context, pub.ic_file_extension));
        final int i = 0;
        this.a = tu0.r(3, new k56(this) { // from class: nh5
            public final /* synthetic */ oh5 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return ((EnhancedVectorDrawable) this.b.getDrawable()).findPath("background");
                    case 1:
                        return ((EnhancedVectorDrawable) this.b.getDrawable()).findPath("foreground");
                    default:
                        return ((EnhancedVectorDrawable) this.b.getDrawable()).findPath("corner");
                }
            }
        });
        final int i2 = 1;
        this.b = tu0.r(3, new k56(this) { // from class: nh5
            public final /* synthetic */ oh5 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return ((EnhancedVectorDrawable) this.b.getDrawable()).findPath("background");
                    case 1:
                        return ((EnhancedVectorDrawable) this.b.getDrawable()).findPath("foreground");
                    default:
                        return ((EnhancedVectorDrawable) this.b.getDrawable()).findPath("corner");
                }
            }
        });
        final int i3 = 2;
        this.c = tu0.r(3, new k56(this) { // from class: nh5
            public final /* synthetic */ oh5 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return ((EnhancedVectorDrawable) this.b.getDrawable()).findPath("background");
                    case 1:
                        return ((EnhancedVectorDrawable) this.b.getDrawable()).findPath("foreground");
                    default:
                        return ((EnhancedVectorDrawable) this.b.getDrawable()).findPath("corner");
                }
            }
        });
    }
}
