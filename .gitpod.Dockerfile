FROM gitpod/workspace-full

USER gitpod

# installing leiningen for clojure projects

RUN sudo apt-get -q update && \
    sudo apt-get install -yq leiningen && \
    sudo rm -rf /var/lib/apt/lists/*
#
# More information: https://www.gitpod.io/docs/config-docker/
