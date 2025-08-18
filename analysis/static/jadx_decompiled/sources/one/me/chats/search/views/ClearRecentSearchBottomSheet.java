package one.me.chats.search.views;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.c33;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BottomSheetWidget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lone/me/chats/search/views/ClearRecentSearchBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "a33", "chats-list_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class ClearRecentSearchBottomSheet extends BottomSheetWidget {
    public ClearRecentSearchBottomSheet() {
        super(null, 1, null);
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View x0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        return new c33(frameLayout, this, getContext());
    }
}
