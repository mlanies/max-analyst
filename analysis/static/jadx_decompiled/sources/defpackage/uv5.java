package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.ExecutorService;
import one.me.chats.list.folderwidget.section.FolderWidgetsSectionView$1;

/* loaded from: classes.dex */
public final class uv5 extends RecyclerView {
    public final jv5 V1;

    public uv5(Context context, ExecutorService executorService) {
        super(context, null);
        jv5 jv5Var = new jv5(executorService);
        this.V1 = jv5Var;
        sdc tv5Var = new tv5();
        setHasFixedSize(true);
        setLayoutManager(new FolderWidgetsSectionView$1(0, false));
        l(tv5Var);
        setAdapter(jv5Var);
        j(new sc1(tu0.G(12 * fk4.d().getDisplayMetrics().density), tu0.G(8 * fk4.d().getDisplayMetrics().density), 3));
    }

    public final void setListener(sv5 sv5Var) {
        this.V1.Y = sv5Var;
    }
}
