package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import one.me.chats.picker.contacts.PickerContactsListWidget;
import one.me.folders.pickerfolders.FoldersPickerScreen;

/* loaded from: classes.dex */
public final /* synthetic */ class pw5 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecyclerView b;

    public /* synthetic */ pw5(RecyclerView recyclerView, int i) {
        this.a = i;
        this.b = recyclerView;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        RecyclerView recyclerView = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = FoldersPickerScreen.s0;
                break;
            default:
                bc7[] bc7VarArr2 = PickerContactsListWidget.y0;
                break;
        }
        return a14.m(recyclerView.getContext());
    }
}
