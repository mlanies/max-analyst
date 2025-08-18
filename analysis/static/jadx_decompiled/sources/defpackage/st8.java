package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.Collection;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;

/* loaded from: classes2.dex */
public final class st8 implements qt3 {
    public final Bundle a = new Bundle();

    @Override // defpackage.qt3
    public final qt3 I(Collection collection) {
        this.a.putBundle("actions", ay7.e(collection));
        return this;
    }

    @Override // defpackage.qt3
    public final qt3 R(float f) {
        Rect rect = fk6.b;
        Bundle bundle = this.a;
        bundle.putParcelable("highlight_padding", rect);
        bundle.putFloat("highlight_radius", f);
        return this;
    }

    @Override // defpackage.qt3
    public final qt3 S(Bundle bundle) {
        return this;
    }

    @Override // defpackage.qt3
    public final qt3 Y(View view) {
        if (view.getId() == -1) {
            throw new IllegalStateException("Check failed.".toString());
        }
        int id = view.getId();
        Bundle bundle = this.a;
        bundle.putInt("anchor_id", id);
        bundle.putSerializable("anchor_class", view.getClass());
        return this;
    }

    public final qt3 a(int i) {
        this.a.putInt("parent_id", i);
        return this;
    }

    @Override // defpackage.qt3
    public final rt3 build() {
        return new MessageContextMenuBottomSheet(new Bundle(this.a));
    }

    @Override // defpackage.qt3
    public final qt3 r() {
        Rect rect = fk6.b;
        Bundle bundle = this.a;
        bundle.putParcelable("highlight_padding", rect);
        bundle.remove("highlight_radius");
        return this;
    }

    @Override // defpackage.qt3
    public final qt3 s() {
        Bundle bundle = this.a;
        bundle.remove("highlight_padding");
        bundle.remove("highlight_radius");
        return this;
    }

    @Override // defpackage.qt3
    public final qt3 w(Rect rect, float f) {
        Bundle bundle = this.a;
        bundle.putParcelable("highlight_padding", rect);
        bundle.putFloat("highlight_radius", f);
        return this;
    }
}
