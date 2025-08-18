package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes.dex */
public final class dm9 implements FilenameFilter {
    public final /* synthetic */ int a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.a) {
            case 0:
                if (!str.startsWith("liblz4-java-") || str.endsWith(".lck")) {
                }
                break;
            default:
                if (str.equals("dso_state") || str.equals("dso_lock") || str.equals("dso_deps")) {
                }
                break;
        }
        return false;
    }
}
