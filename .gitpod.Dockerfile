FROM gitpod/workspace-full

ENV PS1="\\[\\e]0;\\u@: \\w\\a\\]\\[\\e]0;\\u@\\h: \\w\\a\\]\\n\\[\\033[32m\\][\\w]\\[\\033[0m\\]\$(__git_ps1)\\n\\[\\033[1;36m\\]\\u@ $ \\[\\033[0m\\]"

USER gitpod

RUN sudo apt-get -q update && \
    sudo apt-get install -yq leiningen && \
    sudo rm -rf /var/lib/apt/lists/*
#
# More information: https://www.gitpod.io/docs/config-docker/
