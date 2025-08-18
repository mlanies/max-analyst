package defpackage;

import android.view.View;
import android.widget.ImageView;
import ru.ok.messages.views.widgets.TamAvatarView;

/* loaded from: classes2.dex */
public final class hp3 extends dec {
    public final ImageView F0;
    public final TamAvatarView G0;
    public final View H0;
    public e08 I0;
    public final /* synthetic */ ip3 J0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp3(ip3 ip3Var, View view) {
        super(view);
        this.J0 = ip3Var;
        this.F0 = (ImageView) view.findViewById(xxb.row_contact_location__static_image);
        this.G0 = (TamAvatarView) view.findViewById(xxb.row_contact_location__live_image);
        this.H0 = view.findViewById(xxb.row_contact_location__indicator);
        nd7.h(view, new e5(4, this));
    }
}
