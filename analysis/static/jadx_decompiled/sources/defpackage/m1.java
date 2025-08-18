package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import org.msgpack.core.MessageStringCodingException;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public abstract class m1 extends n1 implements uaf {
    public static final char[] o = "0123456789ABCDEF".toCharArray();
    public final byte[] a;
    public volatile String b;
    public volatile CharacterCodingException c;

    public m1(byte[] bArr) {
        this.a = bArr;
    }

    public static void A(StringBuilder sb, int i) {
        sb.append("\\u");
        char[] cArr = o;
        sb.append(cArr[(i >> 12) & 15]);
        sb.append(cArr[(i >> 8) & 15]);
        sb.append(cArr[(i >> 4) & 15]);
        sb.append(cArr[i & 15]);
    }

    public static void x(StringBuilder sb, String str) {
        sb.append("\"");
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < ' ') {
                switch (cCharAt) {
                    case '\b':
                        sb.append("\\b");
                        break;
                    case '\t':
                        sb.append("\\t");
                        break;
                    case '\n':
                        sb.append("\\n");
                        break;
                    case 11:
                    default:
                        A(sb, cCharAt);
                        break;
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        sb.append("\\f");
                        break;
                    case '\r':
                        sb.append("\\r");
                        break;
                }
            } else if (cCharAt <= 127) {
                if (cCharAt == '\"') {
                    sb.append("\\\"");
                } else if (cCharAt != '\\') {
                    sb.append(cCharAt);
                } else {
                    sb.append("\\\\");
                }
            } else if (cCharAt < 55296 || cCharAt > 57343) {
                sb.append(cCharAt);
            } else {
                A(sb, cCharAt);
            }
        }
        sb.append("\"");
    }

    @Override // defpackage.uaf
    public final String a() {
        StringBuilder sb = new StringBuilder();
        x(sb, toString());
        return sb.toString();
    }

    public final String toString() {
        if (this.b == null) {
            z();
        }
        return this.b;
    }

    public final String y() {
        if (this.b == null) {
            z();
        }
        if (this.c == null) {
            return this.b;
        }
        throw new MessageStringCodingException(this.c);
    }

    public final void z() {
        synchronized (this.a) {
            if (this.b != null) {
                return;
            }
            try {
                CharsetDecoder charsetDecoderNewDecoder = vw8.a.newDecoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                this.b = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(this.a).asReadOnlyBuffer()).toString();
            } catch (CharacterCodingException e) {
                try {
                    CharsetDecoder charsetDecoderNewDecoder2 = vw8.a.newDecoder();
                    CodingErrorAction codingErrorAction2 = CodingErrorAction.REPLACE;
                    this.b = charsetDecoderNewDecoder2.onMalformedInput(codingErrorAction2).onUnmappableCharacter(codingErrorAction2).decode(ByteBuffer.wrap(this.a).asReadOnlyBuffer()).toString();
                    this.c = e;
                } catch (CharacterCodingException e2) {
                    throw new MessageStringCodingException(e2);
                }
            }
        }
    }
}
