package one.me.settings;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.bc7;
import defpackage.fs;
import defpackage.ged;
import defpackage.hob;
import defpackage.jqe;
import defpackage.nec;
import defpackage.oi9;
import defpackage.z7b;
import defpackage.z84;
import java.util.ArrayList;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lone/me/settings/SettingsAvatarBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "fed", "settings-screen_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class SettingsAvatarBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ bc7[] C0 = {new hob(SettingsAvatarBottomSheet.class, "title", "getTitle()Lone/me/sdk/uikit/common/TextSource;", 0), z7b.g(nec.a, SettingsAvatarBottomSheet.class, "description", "getDescription()Lone/me/sdk/uikit/common/TextSource;", 0), new hob(SettingsAvatarBottomSheet.class, "buttons", "getButtons()Ljava/util/ArrayList;", 0), new hob(SettingsAvatarBottomSheet.class, ApiProtocol.PARAM_PAYLOAD, "getPayload()Landroid/os/Bundle;", 0), new oi9(SettingsAvatarBottomSheet.class, "isCallbackSent", "isCallbackSent()Z")};
    public final fs A0;
    public final fs B0;
    public final fs y0;
    public final fs z0;

    public SettingsAvatarBottomSheet(Bundle bundle, z84 z84Var) {
        super(bundle);
        this.y0 = new fs(jqe.class, "title");
        this.z0 = new fs(jqe.class, null, "description");
        this.A0 = new fs(ArrayList.class, new ArrayList(), "buttons");
        this.B0 = new fs(Boolean.class, Boolean.FALSE, "callback_sent");
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View x0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        bc7[] bc7VarArr = C0;
        bc7 bc7Var = bc7VarArr[0];
        CharSequence charSequenceB = ((jqe) this.y0.a(this)).b(getContext());
        if (charSequenceB == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        bc7 bc7Var2 = bc7VarArr[1];
        jqe jqeVar = (jqe) this.z0.a(this);
        CharSequence charSequenceB2 = jqeVar != null ? jqeVar.b(layoutInflater.getContext()) : null;
        bc7 bc7Var3 = bc7VarArr[2];
        return new ged(this, charSequenceB, charSequenceB2, (ArrayList) this.A0.a(this), layoutInflater.getContext());
    }

    public SettingsAvatarBottomSheet() {
        super(null);
        this.y0 = new fs(jqe.class, "title");
        this.z0 = new fs(jqe.class, null, "description");
        this.A0 = new fs(ArrayList.class, new ArrayList(), "buttons");
        this.B0 = new fs(Boolean.class, Boolean.FALSE, "callback_sent");
    }
}
