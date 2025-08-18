package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class on {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        ys3 sy4Var;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                sy4Var = new sy4(clipData, 3);
            } else {
                zs3 zs3Var = new zs3();
                zs3Var.b = clipData;
                zs3Var.c = 3;
                sy4Var = zs3Var;
            }
            zmf.g(textView, sy4Var.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        ys3 sy4Var;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            sy4Var = new sy4(clipData, 3);
        } else {
            zs3 zs3Var = new zs3();
            zs3Var.b = clipData;
            zs3Var.c = 3;
            sy4Var = zs3Var;
        }
        zmf.g(view, sy4Var.build());
        return true;
    }
}
