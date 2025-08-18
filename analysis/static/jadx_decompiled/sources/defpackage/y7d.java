package defpackage;

import androidx.work.WorkRequest;
import java.util.Arrays;
import java.util.Collection;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes2.dex */
public interface y7d {
    public static final xs a = new xs((Collection) Arrays.asList("error.comment.chat.access", "error.comment.invalid", "error.message.invalid", "error.message.chat.access", "error.message.like.unknown.like", "error.message.like.unknown.reaction"));
    public static final String[] b = {"modifiers", "accessFlags"};
    public static final long[] c = {15000, WorkRequest.MIN_BACKOFF_MILLIS, MultiFileUploader.UPLOAD_NEXT_INTERVAL};
    public static final int[] d = {1, 3, 4};
}
