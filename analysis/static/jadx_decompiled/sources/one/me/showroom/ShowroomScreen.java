package one.me.showroom;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/showroom/ShowroomScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "stub_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class ShowroomScreen extends Widget {
    /* JADX WARN: Multi-variable type inference failed */
    public ShowroomScreen() {
        super(null, 0, 3, 0 == true ? 1 : 0);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return new View(layoutInflater.getContext());
    }
}
