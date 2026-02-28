class Solution {
    public String simplifyPath(String path) {
        String[] parts = path.split("/");
        String result = "";

        for (int i = 0; i < parts.length; i++) {
            String p = parts[i];

            if (p.equals("") || p.equals(".")) {
                continue;
            } 
            else if (p.equals("..")) {
                if (result.length() > 0) {
                    int lastSlash = result.lastIndexOf("/");
                    if (lastSlash == 0) {
                        result = "";
                    } else {
                        result = result.substring(0, lastSlash);
                    }
                }
            } 
            else {
                result = result + "/" + p;
            }
        }

        return result.length() == 0 ? "/" : result;
    }
}