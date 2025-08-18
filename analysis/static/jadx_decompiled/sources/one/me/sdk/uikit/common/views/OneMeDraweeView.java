package one.me.sdk.uikit.common.views;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import com.facebook.drawee.view.SimpleDraweeView;
import defpackage.e2b;
import defpackage.h76;
import defpackage.hv6;
import defpackage.i76;
import defpackage.ide;
import defpackage.iv6;
import defpackage.n5;
import defpackage.ru6;
import defpackage.rz6;
import defpackage.s36;
import defpackage.wjc;
import defpackage.wv6;
import defpackage.y53;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lone/me/sdk/uikit/common/views/OneMeDraweeView;", "Lcom/facebook/drawee/view/SimpleDraweeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "withAutoPlay", "Le5f;", "setupNewController", "(Z)V", "common_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public class OneMeDraweeView extends SimpleDraweeView {
    public static final /* synthetic */ int B0 = 0;
    public boolean A0;
    public final String x0;
    public final wjc y0;
    public final n5 z0;

    public OneMeDraweeView(Context context) {
        super(context);
        this.x0 = getClass().getName();
        this.y0 = new wjc();
        this.z0 = new n5(3, this);
        setupNewController(false);
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.invalidateDrawable(drawable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new i76(this, 13, drawable));
        } else {
            post(new h76(this, 16, drawable));
        }
    }

    public final void o(wv6 wv6Var, wv6 wv6Var2) {
        ide hv6Var;
        wjc wjcVar = this.y0;
        if (wv6Var == null) {
            if (wv6Var2 == null) {
                setController(null);
                return;
            }
            iv6 iv6VarO = s36.o();
            iv6VarO.getClass();
            wjcVar.a(new hv6(iv6VarO, wv6Var2, null));
            if (getController() == null) {
                setupNewController(this.A0);
                return;
            }
            return;
        }
        if (wv6Var2 != null) {
            iv6 iv6VarO2 = s36.o();
            iv6VarO2.getClass();
            hv6 hv6Var2 = new hv6(iv6VarO2, wv6Var, null);
            iv6 iv6VarO3 = s36.o();
            iv6VarO3.getClass();
            hv6Var = new rz6(y53.M(hv6Var2, new hv6(iv6VarO3, wv6Var2, null)), false);
        } else {
            iv6 iv6VarO4 = s36.o();
            iv6VarO4.getClass();
            hv6Var = new hv6(iv6VarO4, wv6Var, null);
        }
        wjcVar.a(hv6Var);
        if (getController() == null) {
            setupNewController(this.A0);
        }
    }

    public void p(ru6 ru6Var, Animatable animatable) {
    }

    public final void setupNewController(boolean withAutoPlay) {
        this.A0 = withAutoPlay;
        e2b e2bVarA = s36.a.get();
        e2bVarA.g = this.y0;
        e2bVarA.h = this.z0;
        e2bVarA.l = getController();
        e2bVarA.j = withAutoPlay;
        setController(e2bVarA.a());
    }

    public OneMeDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.x0 = getClass().getName();
        this.y0 = new wjc();
        this.z0 = new n5(3, this);
        setupNewController(false);
    }
}
