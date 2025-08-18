package ru.ok.android.externcalls.analytics.internal.api;

import defpackage.kb7;
import defpackage.sr0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipException;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.api.json.JsonSyntaxException;

/* loaded from: classes2.dex */
public class StreamingItemsApiValue extends sr0 {
    private final File file;
    private final boolean isCompressed;

    public StreamingItemsApiValue(File file, boolean z) {
        this.file = file;
        this.isCompressed = z;
    }

    @Override // defpackage.sr0
    public void write(kb7 kb7Var) throws JsonSerializeException, IOException {
        kb7Var.u();
        try {
            InputStream fileInputStream = new FileInputStream(this.file);
            try {
                if (this.isCompressed) {
                    fileInputStream = new GZIPInputStream(fileInputStream, 4096);
                }
                try {
                    try {
                        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
                        try {
                            kb7Var.l(inputStreamReader);
                            inputStreamReader.close();
                            fileInputStream.close();
                        } catch (Throwable th) {
                            try {
                                inputStreamReader.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (JsonSyntaxException e) {
                        throw new JsonSerializeException(e);
                    }
                } catch (Throwable th3) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (ZipException e2) {
                throw new JsonSerializeException(e2);
            }
        } finally {
            kb7Var.t();
        }
    }
}
