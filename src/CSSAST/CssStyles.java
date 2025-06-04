package src.CSSAST;

import java.util.ArrayList;
import java.util.List;

public class CssStyles {
    private final List<String> ids = new ArrayList<>();
    private final List<String> hashs = new ArrayList<>();
    private final List<String> dots = new ArrayList<>();
    private final List<String> commas = new ArrayList<>();
    private final List<Body> bodies = new ArrayList<>();
    private PseudoClass pseudoClass;
    private PseudoElement pseudoElement;

    public void addChild(String id) {
        ids.add(id);
    }

    public void addChild1(String hash) {
        hashs.add(hash);
    }

    public void addChild2(String dot) {
        dots.add(dot);
    }

    public void addChild3(String comma) {
        commas.add(comma);
    }

    public void addChild4(Body body) {
        bodies.add(body);
    }

    public void setPseudoClass(PseudoClass pseudoClass) {
        this.pseudoClass = pseudoClass;
    }

    public void setPseudoElement(PseudoElement pseudoElement) {
        this.pseudoElement = pseudoElement;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // Compose selector line, respecting commas, hashes, dots, ids order roughly
        for (int i = 0; i < hashs.size(); i++) {
            sb.append(hashs.get(i));
        }
        for (int i = 0; i < dots.size(); i++) {
            sb.append(dots.get(i));
        }
        for (int i = 0; i < ids.size(); i++) {
            sb.append(ids.get(i));
        }
        for (int i = 0; i < commas.size(); i++) {
            sb.append(commas.get(i)).append(" ");
        }

        // Add pseudo class and element
        if (pseudoClass != null) {
            sb.append(pseudoClass.toString());
        }
        if (pseudoElement != null) {
            sb.append(pseudoElement.toString());
        }

        sb.append(" {\n");

        // Add bodies with indentation
        for (Body body : bodies) {
            sb.append("  ").append(body.toString()).append("\n");
        }
        sb.append("}\n");

        return sb.toString();
    }
}
